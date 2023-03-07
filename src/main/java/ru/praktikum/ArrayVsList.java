package ru.praktikum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {

    public static void main(String[] args) {
        String[] array = { "one", "two", "three" };

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        List<String> list2 = Arrays.asList(array);

        List<String> list3 = List.of("one", "two", "three");

        System.out.println(Arrays.toString(array));

        System.out.println(list);
    }
}
