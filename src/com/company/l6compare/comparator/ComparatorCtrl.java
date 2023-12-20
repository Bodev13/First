package com.company.l6compare.comparator;

import com.company.l2objects.Dog;

import java.util.Comparator;

public class ComparatorCtrl {
    public static void main(String[] args) {
        Dog d1 = new Dog("Aaaasd", 120);
        Dog d2 = new Dog("Bb", 20);
        Dog d3 = new Dog("C", 13);

        ComparatorMinAge compMin = new ComparatorMinAge();
        ComparatorNameLength comp = new ComparatorNameLength();
        ComparatorMaxDog comparatorMaxDog = new ComparatorMaxDog();

//        System.out.println(comp.compare(d1, d2)==0);

        //создать компаратор, который говорит что самая младшая собака - максимальная (собака, которая младше - больше)
        //применить здесь этот компаратор



//        System.out.println(compMin.compare(d1, d2)>0);
        Comparator<Dog> comparator = comp;


        Dog max;
        if (comparator.compare(d1, d2) > 0) {
            if (comparator.compare(d1, d3) > 0) {
                max = d1;
            } else {
                max = d3;
            }
        } else {
            if (comparator.compare(d2, d3) > 0) {
                max = d2;
            } else {
                max = d3;
            }
        }

        System.out.println(max.getName());

//        Comparator<Dog> comparator1 = maxDog;

        Dog[] dogs = {d1, d2, d3};
        Dog theBiggestDog = dogs[0];

        for (int i = 1; i < dogs.length; i++) {
            if (comparatorMaxDog.compare(dogs[i], theBiggestDog) > 0) {
                theBiggestDog = dogs[i];
            }
        }

        System.out.println(theBiggestDog.getName());

    }
}
