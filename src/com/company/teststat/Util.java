package com.company.teststat;

public class Util {

    int a;
    {
        a = 5;
    }
    int newBla = a = 5;


    public static int b;

    static {
        b = 15;
    }

    public static double PI = 3.14;

    public void nonStaticPrint() {
        System.out.println(b);
        System.out.println(a);
        System.out.println("Этот метод не статический");
    }

    public static void staticPrint() {
        System.out.println(b);
        System.out.println("Этот метод статический");
    }

    public static void staticLock() {
        System.out.println("Этот метод статический");
    }
}
