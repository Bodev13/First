package com.company.lamdas;

import com.company.collect.Cat;

import java.util.*;
import java.util.stream.Collectors;

public class CatLambdas {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Vasya", 15, 17.2);
        Cat cat2 = new Cat("Pushok", 15, 15.1);
        Cat cat3 = new Cat("Vasya", 15, 16.2);
        Cat cat4 = new Cat("Snezhok", 1, 13.2);
        Cat cat5 = new Cat("Klubok", 1, 11.2);

        List<Cat> cats = List.of(cat1, cat2, cat3, cat4, cat5);

        List<Cat> vasyi = cats.stream()
                .filter(cat -> cat.getName().equals("Vasya"))
                .collect(Collectors.toList());

        System.out.println(vasyi);

        List<Cat> sortedByAge = cats.stream()
                .sorted(Comparator.comparing(Cat::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedByAge);

        Cat cat6 = cats.stream()
                .min(Comparator.comparing(Cat::getAge)).get();
        System.out.println(cat6);

        Optional<Cat> max = cats.stream()
                .max(Comparator.comparing(cat -> cat.getDiameterOfNose()));

        Cat cat8 = max.get();


        Cat cat7 = cats.stream()
                .max(Comparator.comparing(Cat::getDiameterOfNose)).get();
        System.out.println(cat7);

        boolean booleanSomething = cats.stream()
                .allMatch(cat -> cat.getAge().equals(7));
        System.out.println(booleanSomething);

        boolean b = cats.stream()
                .anyMatch(cat -> cat.getAge().equals(7));
        System.out.println(b);

        boolean sharik = cats.stream()
                .noneMatch(cat -> cat.getName().equals("Sharik"));
        System.out.println(sharik);

        Map<Integer, List<Cat>> bands = cats.stream()
                .collect(Collectors.groupingBy(Cat::getAge));

        System.out.println(bands);

    }
}
