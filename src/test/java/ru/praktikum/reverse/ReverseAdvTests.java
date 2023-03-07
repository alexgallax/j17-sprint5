package ru.praktikum.reverse;

import org.junit.Test;
import ru.praktikum.ListReverser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReverseAdvTests {

    @Test
    public void reverseWithNull() {
        ListReverser reverser = new ListReverser();

        List<Integer> testList = new ArrayList<>();
        testList.add(null);

        assertEquals(1, reverser.reverseList(testList).size());
    }

    @Test
    public void reverseWithAlsoNull() {
        ListReverser reverser = new ListReverser();

        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(null);
        testList.add(3);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(3);
        expectedList.add(null);
        expectedList.add(1);

        assertEquals(expectedList, reverser.reverseList(testList));
    }

    @Test
    public void reverseAsList() {
        ListReverser reverser = new ListReverser();

        List<Integer> testList = Arrays.asList(1, 2, 3);

        assertEquals(List.of(3, 2, 1), reverser.reverseList(testList));
    }

    @Test
    public void reverseListOf() {
        ListReverser reverser = new ListReverser();

        List<Integer> testList = List.of(1, 2, 3);

        assertEquals(List.of(3, 2, 1), reverser.reverseList(testList));
    }
}
