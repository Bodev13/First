package com.company.l6compare.comparator;

import com.company.l2objects.Dog;

import java.util.Comparator;

public class ComparatorNameLength implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
