package com.company.exceptions;

public class Home {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");


        try {
            dog.putCollar();
            dog.walk();
        } catch (DogIsNotReadyException e) {
            e.printStackTrace();
        }

        Cat cat = new Cat("Вася", 0);
        try {
            cat.checkLives();
        } catch (CatIsDeadException e) {
            e.printStackTrace();
        }
    }
}
