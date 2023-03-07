package ru.praktikum.lists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ListTests {

    @Test
    public void getByIndex() {
        List<String> list = list();

        assertEquals("one", list.get(0));
    }

    @Test
    public void addByIndex() {
        List<String> list = list();
        list.add(1, "none");

        System.out.println(list);
        assertEquals(4, list.size());
    }

    @Test
    public void updateByIndex() {
        List<String> list = list();
        list.set(1, "none");

        System.out.println(list);
        assertEquals("none", list.get(1));
    }

    @Test
    public void removeByIndex() {
        List<String> list = list();
        list.remove(1);

        System.out.println(list);
        assertEquals(2, list.size());
    }

    @Test
    public void removeByValue() {
        List<String> list = list();
        list.remove("two");

        System.out.println(list);
        assertEquals(2, list.size());
    }

    @Test
    public void clearList() {
        List<String> list = list();
        list.clear();

        System.out.println(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void containsElement() {
        List<String> list = list();

        assertTrue(list.contains("two"));
    }

    @Test
    public void compareLists() {
        List<String> list = list();
        list.add("four");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("one");
        expectedList.add("two");
        expectedList.add("three");
        expectedList.add("four");

        assertEquals(expectedList, list);
    }

    private List<String> list() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        return list;
    }
}
