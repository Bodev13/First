package com.company.l1basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Arrays.sort;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
    public static void sort(String[] array) {
        String string;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(isGreaterThan(array[j],array[i])){
                    string = array[i];
                    array[i] = array[j];
                    array[j] = string;
                }
            }

        }

    }

}





















