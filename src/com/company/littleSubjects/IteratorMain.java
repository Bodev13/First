package com.company.littleSubjects;

import java.util.*;

public class IteratorMain {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(55);
        integers.add(34);
        integers.add(2);
        integers.add(67);
        integers.add(19);

        // 0  1  2  3  4
        // 55 34 2 67 19

        Iterator iterator = integers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        Iterator<Map.Entry<String, Integer>> mapIterator = map.entrySet().iterator();

        while (mapIterator.hasNext()) {
            Map.Entry<String, Integer> entry = mapIterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
