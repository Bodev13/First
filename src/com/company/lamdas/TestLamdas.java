package com.company.lamdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestLamdas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("JHGjhgh");
        list.add("JHG");
        list.add("JHGj");
        list.add("J");
        list.add("J");
        list.add("JHGjhghвав");

        list.sort(String::compareTo);

        System.out.println(list);

        list.sort(Comparator.reverseOrder());

        System.out.println(list);




    }
}
