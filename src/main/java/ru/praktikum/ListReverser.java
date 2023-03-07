package ru.praktikum;

import java.util.List;

public class ListReverser {

    public List<Integer> reverseList(List<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            swap(list, i, list.size() - i - 1);
        }
        return list;
    }

    private void swap(List<Integer> list, int idx1, int idx2) {
        Integer temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
}
