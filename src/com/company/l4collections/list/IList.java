package com.company.l4collections.list;

import com.company.l4collections.ICollection;

public interface IList extends ICollection {
    Object remove(int index);
    // 23 2 3 12 2 3 654
    int indexOf(Object o); //(2) -> 1
    int lastIndexOf(Object o);//(2) -> 4
    Object get(int index);

    /*
    set(int index, Object o)
    add(int index, Object o)
    sort(Comparator c);
     */

}
