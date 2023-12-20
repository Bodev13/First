package com.company.l4collections.list;

import com.company.l4collections.list.arrayList.OptimizedArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    IList list;

    @BeforeEach
    void setUp() {
        //list = new SimpleArrayList();
        list = new OptimizedArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
    }

    @Test
    void add() {
        assertEquals(4, list.size());
        assertFalse(list.contains("E"));

        assertTrue(list.add("E"));

        assertTrue(list.contains("E"));
        assertEquals(5, list.size());
    }

    @Test
    void remove() {
//        fail();
        assertTrue(list.remove("B"));
        assertTrue(list.remove("A"));
        assertTrue(list.remove("D"));
        assertTrue(list.remove("C"));

        assertTrue(list.isEmpty());

        assertFalse(list.remove("B"));
        assertFalse(list.remove("A"));
        assertFalse(list.remove("D"));
        assertFalse(list.remove("C"));
    }

    @Test
    void removeIndex() {

        assertEquals("A", list.remove(0));
        assertEquals("B", list.remove(0));
        assertEquals("D", list.remove(1));
        assertEquals("C", list.remove(0));
        assertNull(list.remove(0));
    }

    @Test
    void contains() {
        assertTrue(list.contains("A"));
        assertTrue(list.contains("B"));
        assertTrue(list.contains("C"));
        assertTrue(list.contains("D"));

        assertFalse(list.contains("E"));
        assertFalse(list.contains(""));
        assertFalse(list.contains("X"));
    }

    @Test
    void isEmpty() {
        assertFalse(list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void size() {
        assertEquals(4,list.size());
        list.add("E");

        assertEquals(5, list.size());

        list.remove("E");
        assertEquals(4, list.size());

        list.remove("A");
        list.remove("B");
        list.remove("C");
        list.remove("D");

        assertEquals(0, list.size());
    }

    @Test
    void clear() {
//        fail();
        assertTrue(list.size() > 0);
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void indexOf() {
        list.add("B");
        list.add("C");

        assertEquals(1, list.indexOf("B"));
        assertEquals(3, list.indexOf("D"));
    }

    @Test
    void lastIndexOf() {
        list.add("B");
        list.add("C");

        assertEquals(4,list.lastIndexOf("B"));
        assertEquals(0, list.lastIndexOf("A"));
    }

    @Test
    void get() {
//        fail();
        assertEquals("D", list.get(3));
        assertNull(list.get(-1));
        assertNull(list.get(4));
    }
}