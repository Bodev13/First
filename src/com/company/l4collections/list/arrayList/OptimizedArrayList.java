package com.company.l4collections.list.arrayList;

import com.company.l4collections.list.IList;

public class OptimizedArrayList implements IList {
    private final int INITIAL_SIZE = 8;

    private Object[] array = new Object[INITIAL_SIZE];
    private int size = 0;


    @Override
    public boolean add(Object o) {
        if(array.length == size){
            extendArray();
        }
        array[size] = o;
        size++;
        return true;
    }


    private void extendArray() {
        Object[] newArray = new Object[array.length * 2];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if(index == -1){
            return false;
        }

        for(int i = index; i < size-1; i++){
            array[i] = array[i+1];
        }
        size--;

        return true;
    }

    @Override
    public boolean contains(Object o) {//todo!
        for(int i = 0; i < size; i++){
            if(array[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {//todo!
        return size() == 0;
    }

    @Override
    public int size() {//todo!
        return size;
    }

    @Override
    public void clear() {//todo!
        array = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public Object remove(int index) {
        Object removed = array[index];
        if(index < 0 || index >= size){
            return null;
        }
        for(int i = index; i < size-1; i++){
          array[i] = array[i+1];
        }
        size--;
        return removed;
    }

    @Override
    public int indexOf(Object o) {//todo!
        for(int i = 0; i < size; i++){
            if(array[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {//todo!
        for(int i = size-1; i >= 0; i--){
            if(array[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Object get(int index) {//todo!
        if(index >= 0 && index < size){
            return array[index];
        }
        return null;
    }
}
