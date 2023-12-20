package com.company.multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("It's start of job main thread");
        FirstThread thread = new FirstThread();
        thread.start();

        Thread secondThread = new Thread(() -> {

        });
        secondThread.start();

        thread.join();
        secondThread.join();

        System.out.println("It's finish");
    }
}

class FirstThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("FirstThread is printing " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("SecondThread is printing " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
