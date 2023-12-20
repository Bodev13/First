package com.company.l4collections.list.arrayList;

import com.company.l4collections.list.IList;

public class SimpleArrayList implements IList {

    private Object[] arrayObjects = new Object[0];


    @Override
    public boolean add(Object o) {
        Object[] newObjects = new Object[arrayObjects.length+1];
        for(int i = 0; i < arrayObjects.length; i++){
            newObjects[i] = arrayObjects[i];
        }
        newObjects[newObjects.length-1] = o;
        arrayObjects = newObjects;

        return true;
    }



    @Override
    public boolean contains(Object o) {
        for(int i = 0; i < arrayObjects.length; i++){
            if(arrayObjects[i] == o){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return arrayObjects.length;
    }

    @Override
    public void clear() {
        Object[] clearedArray = new Object[0];
        arrayObjects = clearedArray;
    }

    @Override
    public Object remove(int index) {
        if(index < 0 || index >= arrayObjects.length){
            return null;
        }

        Object[] newArray1 = new Object[arrayObjects.length-1];
        for(int i = 0; i < index; i++){
            newArray1[i] = arrayObjects[i];
        }
        for(int i = index; i < newArray1.length; i++){
            newArray1[i] = arrayObjects[i+1];
        }
        Object removed = arrayObjects[index];
        arrayObjects = newArray1;
        return removed;
    }

    @Override
    public boolean remove(Object o) {
        return remove(indexOf(o)) != null;
    }

    @Override
    public int indexOf(Object o) {
        for(int i = 0; i < arrayObjects.length; i++){
            if(arrayObjects[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for(int i = arrayObjects.length-1; i >= 0; i--){
            if(arrayObjects[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Object get(int index) {
        if(index >= 0 && index < arrayObjects.length){
            return arrayObjects[index];
        }
        return null;
    }
}
