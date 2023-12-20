package com.company.l6compare.comparable;

import com.company.l2objects.Dog;

public class ComparableCtrl {

    public static void main(String[] args) {
        Dog d1 = new Dog("A", 12);
        Dog d2 = new Dog("B", 20);
        Dog d3 = new Dog("C", 130);



        System.out.println(d1.compareTo(d2) > 0);

//        int a = 100;
//        int b = 200;
//        int c = 30;
//
//        int max;
//        if (a > b) {
//            if (a > c) {
//                max = a;
//            } else {
//                max = c;
//            }
//        } else {
//            if (b > c) {
//                max = b;
//            } else {
//                max = c;
//            }
//        }
//        System.out.println(max);
        System.out.println();
        //создать 3х собак и вывести имя самой большой (по comparable)

//        Dog max;
//        if (d1.compareTo(d2) > 0) {
//            if(d1.compareTo(d3) > 0){
//                max = d1;
//            }else{
//                max = d3;
//            }
//        }else{
//            if(d2.compareTo(d3) > 0){
//                max = d2;
//            }else{
//                max = d3;
//            }
//        }

//        System.out.println(max.getName());

//        Dog maxDog = d1;
//        if(d2.compareTo(maxDog) > 0){
//            maxDog = d2;
//        }
//        if(d3.compareTo(maxDog) > 0){
//            maxDog = d3;
//        }
//        System.out.println(maxDog.getName());



        //создать 3х собак и вывести имя самой большой (по comparable)
        Dog[] dogs = {d1, d2, d3};
        Dog maxDog = dogs[0];
        for(int i = 1; i < dogs.length; i++){
            if(dogs[i].compareTo(maxDog) > 0){
                maxDog = dogs[i];
            }
        }
        System.out.println(maxDog.getName());

    }

}
