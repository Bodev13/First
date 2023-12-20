package com.company.l2objects;

import javax.sound.midi.Soundbank;
import java.lang.constant.Constable;
import java.lang.module.FindException;
import java.util.Locale;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
//        Dog d1 = new Dog();
//        d1.setName("Zhyzha");
//        d1.age = 3;
//
//        System.out.println(d1.name + " " + d1.age);
//
//
//        Dog d2 = new Dog();
//        d2.name = "Gerasim";
//        d2.age = 7;
//
//        System.out.println(d2.name + " " + d2.age);
//        System.out.println(d1.name + " " + d1.age);
//
//        Dog d3 = d1;
//        d3.age = 132;
//
//        System.out.println(d3.name + " " + d3.age);
//        System.out.println(d1.name + " " + d1.age);


//        d1.setAge(12);
//        d1.setAge(-1);
//        d1.setAge(30);
//        System.out.println(d1.getName() + " " + d1.getAge());
//
//        d1.setName("Zyablik!");
//        d1.bark();
//
//        Dog d2 = new Dog();
//        d2.setAge(2);
//        d2.setName("QWE");
//        d2.bark();
//        d1.bark();
//        d1.bark(5);
//        d2.bark(5);

        //Дано число n - количество собак.
        //запросить для каждой собаки имя и возраст и вывести информацию о каждой собаке

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Введите количество собак: ");
//        int n = scanner.nextInt();
//        Dog[] dogs = new Dog[n];

//        for(int i = 0; i < dogs.length; i++){
//            System.out.print("Введите кличку: ");
//            String name = scanner.next();
//            System.out.print("Введите возраст: ");
//            int age = scanner.nextInt();
//
//            Dog dog = new Dog();
//            dog.setName(name);
//            dog.setAge(age);
//            dogs[i] = dog;
//            System.out.println("Собака в клетке");
//        }

//        for(int i = 0; i < dogs.length; i++){
//            dogs[i] = new Dog();
//            System.out.print("Введите кличку: ");
//            dogs[i].setName(scanner.next());
//            System.out.print("Введите возраст: ");
//            dogs[i].setAge(scanner.nextInt());
//
//            System.out.println("Успех!");
//        }

//        for(int i = 0; i < dogs.length; i++){
//            System.out.print("Введите кличку: ");
//            String name = scanner.next();
//            System.out.print("Введите возраст: ");
//            int age = scanner.nextInt();
//
//            dogs[i] = new Dog(name, age);
//
//            System.out.println("Собака в клетке");
//        }
//
//        for(int i = 0; i < dogs.length; i++){
//            //System.out.println("Кличка: " + dogs[i].getName() + ", Возраст: " + dogs[i].getAge());
//            System.out.println(dogs[i]);
//        }


        //Дано число n - количество собак.
        //запросить для каждой собаки имя и возраст

        //1) заставить самую старшую собаку пролаять столько раз, сколько ей лет.
        //2) заставить самую молодую собаку пролаять столько раз, сколько лет самой старшей.

//        System.out.print("введите количество собак: ");
//        int n = scanner.nextInt();
//        Dog[] dogs = new Dog[n];

//        for(int i = 0; i < dogs.length; i++){
//            System.out.println("введи имя: ");
//            String name = scanner.next();
//            System.out.println("введи возраст: ");
//            int age = scanner.nextInt();
//            dogs[i] = new Dog(name, age);
//        }
//
////        Dog oldest = dogs[0];
////        for(int index = 0; index < dogs.length; index++){
////            if(oldest.getAge() < dogs[index].getAge()){
////                oldest = dogs[index];
////            }
////        }
////
////        oldest.bark(oldest.getAge());
//
//        int oldestIndex = 0;
//        for(int i = 0; i < dogs.length; i++){
//            if(dogs[oldestIndex].getAge() < dogs[i].getAge()){
//                oldestIndex = i;
//            }
//        }
//        Dog oldest = dogs[oldestIndex];
//        oldest.bark(oldest.getAge());
//
//        System.out.println(oldest);


//        Dog d1 = new Dog("A", 1);
//        Dog d2 = new Dog("B", 2);
//        Dog d4 = new Dog("A", 1);
//
//
//        Dog d3 = d1;
//
////        System.out.println(d3 == d1);
////        System.out.println(d1 == d1);
////        System.out.println(d1 == d2);
////        System.out.println(d1 == d4);
//
//        System.out.println(d1.equals(d1));
//        System.out.println(d1.equals(d3));
//        System.out.println(d1.equals(d2));
//        System.out.println(d1.equals(d4));

//        for (int i = 0; i < dogs.length; i++) {
//            System.out.println("Введите имя: ");
//            String name = scanner.next();
//            System.out.println("Введите возраст: ");
//            int age = scanner.nextInt();
//            dogs[i] = new Dog(name, age);
//        }
//
//        Dog oldest = dogs[0];
//        Dog youngest = dogs[0];
//        for (int index = 0; index < dogs.length; index++) {
//            if (youngest.getAge() > dogs[index].getAge()) {
//                youngest = dogs[index];
//            }
//            if (oldest.getAge() < dogs[index].getAge()) {
//                oldest = dogs[index];
//            }
//        }
//        youngest.bark(oldest.getAge());

//        Dog dog = new Dog("Жужа");
//        HelperDog helperDog = new HelperDog("Леонард");
//        MegaHelperDog megaHelperDog = new MegaHelperDog("Angel");
//        AngryDog angryDog = new AngryDog("Rex");
//
//        Dog d1 = helperDog;
//
////        helperDog = (HelperDog) dog;//нельзя так делать, потому что dog не содержить экземпляра класса HelperDog (или его наследников)
//
//        HelperDog h1 = (HelperDog) megaHelperDog;
//
//        d1 = angryDog;
//        h1 = (HelperDog) d1;
//
//
//        System.out.println(dog);
//        System.out.println(h1);

        System.out.print("Введи количество собак: ");
        int n = scanner.nextInt();
        Dog[] dogs = new Dog[n];

        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Введите имя: ");
            String name = scanner.next();

            System.out.print("enter type (1 = hp, 2 = mhp, 3 = ad): ");
            int type = scanner.nextInt();


            if (type == 1) {
                dogs[i] = new HelperDog(name);
            }
            if (type == 2) {
                dogs[i] = new MegaHelperDog(name);
            }
            if (type == 3) {
                dogs[i] = new AngryDog(name);
            }

            if (type < 1 | type > 3) {
                System.out.println("такого типа нет, создаём обычную");
                dogs[i] = new Dog(name);
            }
        }

        System.out.println();


        //int totalDogs = 0;

//        for (int i = 0; i < dogs.length; i++) {
//            if(dogs[i] instanceof AngryDog){
//                ((AngryDog) dogs[i]).toBeMad();
//            }
//
//            if(dogs[i] instanceof HelperDog){
//                System.out.println(dogs[i]);
//                totalDogs++;
//            }
//        }
//        System.out.println(totalDogs);

//        int megaHelpers = 0;
//        int helpers = 0;
//
//        for(int i = 0; i < dogs.length; i++){
//            if(dogs[i] instanceof MegaHelperDog){
//                megaHelpers++;
//            }
//            if(dogs[i] instanceof HelperDog & !(dogs[i] instanceof MegaHelperDog)){
//                helpers++;
//            }
//        }

//        if(totalDogs - megaHelpers > megaHelpers ){
//            System.out.println("Да, больше обычных");
//        } else {
//            System.out.println("Нет, обычных не больше");
//        }

//        String dinner = "Мясо!";

//        for(int i = 0; i < dogs.length; i++){
//            dogs[i].eat(dinner);
//        }



        Bird bird = new Bird();
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();

        Animal[] animals = new Animal[dogs.length + 3];

        for(int i = 0; i < dogs.length; i++){
            animals[i] = dogs[i];
        }
        animals[animals.length - 1] = bird;
        animals[animals.length - 2] = bird1;
        animals[animals.length - 3] = bird2;

        //String food = "картошку";

        Potato potato = new Potato();
        Seeds seeds = new Seeds();

//создай еду для птичек (крупу какую-нибудь) и накорми ей только птиц. А Собак картошкой
        for(int i = 0; i < animals.length; i++){
            if(animals[i] instanceof Dog){
                animals[i].eat(potato);
            } else {
                animals[i].eat(seeds);
            }
        }



    }


    //1) вывести всех помощников
    //2) разозлить всех злых
    //3) посчитать сколько собак помощников и мегапомощников вместе взятых
    //4) проверить, среди всех собак обычных помощников больше чем мега или нет? (вывести да или нет)


    //5) добавить у всех собак метод "кушать", который принимает строку (например, название еды)
    //6) переопределить метод "кушать" так, чтобы злые собаки еду ели злобно и громко, а помощники едой делились с птичками

}
