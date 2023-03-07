package ru.praktikum.lists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsPerf {

    private static final int MAX = 200_000;

    @Test
    public void arrayListAddPerf() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < MAX; i++) {
            list.add(0, i);
        }
    }

    @Test
    public void linkedListAddPerf() {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < MAX; i++) {
            list.add(0, i);
        }
    }

    @Test
    public void linkedListGetPerf() {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < MAX; i++) {
            list.add(0, i);
        }

        for (int i = 0; i < MAX; i++) {
            list.get(i);
        }
    }
}
