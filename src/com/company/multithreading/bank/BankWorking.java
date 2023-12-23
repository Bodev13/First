package com.company.multithreading.bank;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankWorking {
    public static void main(String[] args) throws InterruptedException {

        Broker broker = new Broker();
        Thread thread1 = new Thread(broker::firstThread);
        Thread thread2 = new Thread(broker::secondThread);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        broker.finished();
    }
}

class Broker {
    private Account acc1 = new Account();
    private Account acc2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void takeLocks(Lock lock1, Lock lock2) {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }
                if (firstLockTaken) {
                    lock1.unlock();
                }
                if (secondLockTaken) {
                    lock2.unlock();
                }

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }




    }

    public void firstThread() {
        Random randomAmount = new Random();
        for (int i = 0; i < 10000; i++) {
            takeLocks(lock1, lock2);
            try {
                Account.transfer(acc1, acc2, randomAmount.nextInt(0, 100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread() {
        Random randomAmount = new Random();
        for (int i = 0; i < 10000; i++) {
            takeLocks(lock2, lock1);
            try {
                Account.transfer(acc2, acc1, randomAmount.nextInt(0, 100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished() {
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        System.out.println("баланс счетов : " + (acc1.getBalance() + acc2.getBalance())); // баланс счетов : 10000100000
    }
}

class Account {
    int balance = 10000;

    public void deposit(int x) {
        balance += x;
    }

    public void withdraw(int y) {
        balance -= y;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account acc1, Account acc2, int depositAmount) {
        acc1.withdraw(depositAmount);
        acc2.deposit(depositAmount);
    }
}
