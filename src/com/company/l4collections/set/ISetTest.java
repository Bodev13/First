package com.company.l4collections.set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ISetTest {

    private ISet set;

    @BeforeEach
    void setUp() {
        set = new SimpleSet();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
    }
    @Test
    void add() {
        assertEquals(4, set.size());
        assertTrue(set.add("E"));
        assertEquals(5, set.size());
        assertFalse(set.add("E"));
        assertEquals(5, set.size());
        assertFalse(set.add("A"));
        assertFalse(set.add("B"));
        assertFalse(set.add("C"));
        assertFalse(set.add("D"));
    }
    @Test
    void remove() {
        assertTrue(set.remove("B"));
        assertTrue(set.remove("A"));
        assertTrue(set.remove("D"));
        assertTrue(set.remove("C"));

        assertTrue(set.isEmpty());

        assertFalse(set.remove("B"));
        assertFalse(set.remove("A"));
        assertFalse(set.remove("D"));
        assertFalse(set.remove("C"));
    }
    @Test
    void contains() {
        assertTrue(set.contains("A"));
        assertTrue(set.contains("B"));
        assertTrue(set.contains("C"));
        assertTrue(set.contains("D"));

        assertFalse(set.contains("E"));
        assertFalse(set.contains(""));
        assertFalse(set.contains("X"));
    }
    @Test
    void isEmpty() {
        assertFalse(set.isEmpty());
        set.clear();
        assertTrue(set.isEmpty());
    }
    @Test
    void size() {
        assertEquals(4,set.size());
        set.add("E");

        assertEquals(5, set.size());

        set.remove("E");
        assertEquals(4, set.size());

        set.remove("A");
        set.remove("B");
        set.remove("C");
        set.remove("D");

        assertEquals(0, set.size());
    }
    @Test
    void clear() {
        assertTrue(set.size() > 0);
        set.clear();
        assertEquals(0, set.size());
    }

}