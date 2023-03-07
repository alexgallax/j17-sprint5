package ru.praktikum.sets;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SetsTests {

    @Test
    public void createSet() {
        List<String> set = new ArrayList<>();
        set.add("one");
        set.add("two");
        set.add("three");

        System.out.println(set);
        assertEquals(3, set.size());
    }

    @Test
    public void createSetWithDupl() {
        List<String> set = new ArrayList<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("two");
        set.add("two");

        System.out.println(set);
        assertEquals(3, set.size());
    }

    @Test
    public void createSetOf() {
        Set<String> set = Set.of("one", "two", "three");

        System.out.println(set);
        assertEquals(3, set.size());
    }

    @Test
    public void addByIndex() {
        Set<String> set = set();
        set.add("four");

        System.out.println(set);
        assertEquals(4, set.size());
    }

    @Test
    public void removeByValue() {
        Set<String> set = set();
        set.remove("two");

        System.out.println(set);
        assertEquals(2, set.size());
    }

    @Test
    public void clearSets() {
        Set<String> set = set();
        set.clear();

        System.out.println(set);
        assertTrue(set.isEmpty());
    }

    @Test
    public void containsElement() {
        Set<String> set = set();

        assertTrue(set.contains("two"));
    }

    @Test
    public void compareSets() {
        Set<String> set = set();
        set.add("four");

        Set<String> expectedSet = new HashSet<>();
        expectedSet.add("one");
        expectedSet.add("two");
        expectedSet.add("four");
        expectedSet.add("three");

        System.out.println(set);
        System.out.println(expectedSet);
        assertEquals(expectedSet, set);
    }

    private Set<String> set() {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");

        return set;
    }
}
