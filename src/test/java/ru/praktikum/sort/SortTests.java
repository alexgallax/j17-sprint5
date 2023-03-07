package ru.praktikum.sort;

import org.junit.Test;
import ru.praktikum.SpaceShip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTests {

    @Test
    public void sortShips() {
        List<SpaceShip> list = new ArrayList<>();
        list.add(new SpaceShip("Soyuz", 3));
        list.add(new SpaceShip("Dragon", 4));
        list.add(new SpaceShip("Proton", 0));
        list.add(new SpaceShip("Soyuz TM", 3));

        Collections.sort(list);

        System.out.println(list);
    }
}
