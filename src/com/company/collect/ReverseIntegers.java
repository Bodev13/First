package com.company.collect;

import java.util.Comparator;

public class ReverseIntegers implements Comparator<Integer> {
    @Override
    //                         124          136
    public int compare(Integer o1, Integer o2) {
//        if ((o1 - o2) > 0) {
//            return 1;
//        } else if (o1 == o2) {
//            return 0;
//        } else if ((o1 - o2) < 0){
//            return -1;
//        }
        return o2 - o1;
    }
}
