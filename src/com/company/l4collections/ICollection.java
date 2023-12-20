package com.company.l4collections;

public interface ICollection {
    boolean add(Object o);
    boolean remove(Object o);
    boolean contains(Object o);
    boolean isEmpty();
    int size();
    void clear();

}
