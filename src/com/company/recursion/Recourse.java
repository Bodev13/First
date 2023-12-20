package com.company.recursion;

import com.company.teststat.Util;

public class Recourse {
    public static void main(String[] args) {
        recursion(5);
        int d = 5;
        System.out.println("Факториал числа " + d + " равен " + factorialCount(d));
    }

    public static void recursion(int x)  {
        System.out.println("Сейчас число х равно " + x );
        x++;
        if (x == 20) {
            return;
        }
        recursion(x);

    }


    public static int factorialCount(int d) { // 3  -> 2  -> 1
        Util.staticLock();

    if (d == 1) {
        return 1;
    }
        return d * factorialCount(d-1); // 3 * factorialCount(2) * factorialCount(1) = 6
    }














}
