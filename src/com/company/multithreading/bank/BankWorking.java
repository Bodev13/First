package com.company.multithreading.bank;

import java.util.Random;

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

    public void firstThread() {
        Random randomAmount = new Random();
        for (int i = 0; i < 10000; i++) {
//          synchronized (acc1) {
//            synchronized (acc2) {
                    Account.transfer(acc1, acc2, randomAmount.nextInt(0, 100));
//                }
//            }
        }

    }

    public void secondThread() {
        Random randomAmount = new Random();
        for (int i = 0; i < 10000; i++) {
//            synchronized (acc1) {
//                synchronized (acc2) {
                    Account.transfer(acc2, acc1, randomAmount.nextInt(0, 100));
//                }
//            }
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
