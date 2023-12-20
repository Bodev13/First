package com.company.generics;

import com.company.collect.Cat;


public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(111);

        Integer item = integerBox.getItem();

        System.out.println(item);

        System.out.println("a = " + (5 + 5));

//        Box<String> stringBox = new Box<>("Hello World!");
//
//        String item1 = stringBox.getItem();
//
//        System.out.println(item1);
//
//        Box<Cat> catBox = new Box<>(new Cat("Vasya", 1, 17.2));
//
//        Cat cat = catBox.getItem();
//
//        System.out.println(cat);

    }
}
