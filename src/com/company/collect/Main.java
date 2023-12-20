package com.company.collect;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(printMain(5));

        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(1);
        integers.add(3);

        System.out.println(integers);
        Cat cat1 = new Cat("Vasya", 5, 17.2);
        Cat cat2 = new Cat("Vasya", 5, 15.1);
        Cat cat3 = new Cat("Vasya", 5, 16.2);
        Cat cat4 = new Cat("Vasya", 5, 13.2);
        Cat cat5 = new Cat("Vasya", 5, 11.2);
        Cat cat6 = new Cat("Vasya", 5, 11.2);

        HashSet<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);

        System.out.println();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("A", 1);

        TreeSet<Integer> ints = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        ints.add(45);
        ints.add(124);
        ints.add(136);
        ints.add(521);
        ints.add(1);
        ints.add(1);

        System.out.println();

        TreeSet<String> stringsSet = new TreeSet<>();
        stringsSet.add("E");
        stringsSet.add("J");
        stringsSet.add("I");
        stringsSet.add("O");
        stringsSet.add("E");
        stringsSet.add("P");

        TreeSet<Cat> catTreeSet = new TreeSet<>();
        catTreeSet.add(cat1);
        catTreeSet.add(cat2);
        catTreeSet.add(cat3);
        catTreeSet.add(cat4);
        catTreeSet.add(cat5);
        catTreeSet.add(cat6);

        System.out.println();
    }

    public static String printMain(int a) {
        return "You have write number " + a;
    }
}
