package com.company.exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args)  {
        //System.out.println(10 / 0);
//        ArithmeticException arithmeticException = new ArithmeticException();
//        arithmeticException.printStackTrace();
//        System.exit(11);

        String text = null;


        try {
            text.length();
        } catch (Exception e) {
        }

        System.out.println("------Логический конец-----------");


        try {
            Files.copy(new File("D:/text.txt").toPath() , new File("C:/newTextFile.txt").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }


        int a = 37;

        if (a == 37) {
            try {
                throw new MyException("Делить на 37 нельзя");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }


    }
}
