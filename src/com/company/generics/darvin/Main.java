package com.company.generics.darvin;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal());
        listOfAnimals.add(new Animal());

        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat());
        cats.add(new Cat());

        // Object
        // Animal
        // Cat

        test(listOfAnimals);
        test(cats);
    }

    public static void test(List<? extends Animal> animals) {
        animals.forEach(Animal::sayHello);
    }
}
