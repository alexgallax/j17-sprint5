package ru.praktikum.reverse;

import org.junit.Test;
import ru.praktikum.ListReverser;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReverseTests {

    @Test
    public void reverseEmpty() {
        ListReverser reverser = new ListReverser();

        List<Integer> testList = new ArrayList<>();

        assertTrue(reverser.reverseList(testList).isEmpty());
    }

    @Test
    public void reverseSizeOne() {
        ListReverser reverser = new ListReverser();

        List<Integer> testList = new ArrayList<>();
        testList.add(1);

        assertEquals(List.of(1), reverser.reverseList(testList));
    }

    @Test
    public void reverseSizeTwo() {
        ListReverser reverser = new ListReverser();

        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);

        assertEquals(List.of(2, 1), reverser.reverseList(testList));
    }

    @Test
    public void reverseEvenSize() {
        ListReverser reverser = new ListReverser();

        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);

        assertEquals(List.of(4, 3, 2, 1), reverser.reverseList(testList));
    }

    @Test
    public void reverseOddSize() {
        ListReverser reverser = new ListReverser();

        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);

        assertEquals(List.of(3, 2, 1), reverser.reverseList(testList));
    }
}
