package com.company.l6compare.comparator;

import com.company.l2objects.Dog;

import java.util.Comparator;

public class ComparatorMinAge implements Comparator<Dog> {
    // сравниваем два объекта типа Dog
    @Override
    public int compare(Dog o1, Dog o2) {
    //создаю переменную max, чтобы вписать в нее ниже возраст младшей собаки

    //проверяю, если возраст первой собаки меньше возраста второй собаки,
//        if (o1.getAge() > o2.getAge()) {
//            return -1;
//        }
//        if(o1.getAge() < o2.getAge()){
//            return 1;
//        }
//        return 0;
        //o1 o2
        //10  50
        return o2.getAge() - o1.getAge();
    }
}

