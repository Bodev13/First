package com.company.teststat;

import com.company.exceptions.Cat;

public class TestStaticMain {


    public static void main(String[] args) {
        int a = 5;
        Util util = new Util();

        util.nonStaticPrint();

        Util.staticPrint();


    }
}
