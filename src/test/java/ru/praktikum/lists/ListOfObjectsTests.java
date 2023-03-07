package ru.praktikum.lists;

import org.junit.Test;
import ru.praktikum.SpaceShip;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ListOfObjectsTests {

    private final SpaceShip soyuz = new SpaceShip("Soyuz", 3);
    private final SpaceShip dragon = new SpaceShip("Dragon", 4);
    private final SpaceShip proton = new SpaceShip("Proton", 0);

    @Test
    public void containsElement() {
        List<SpaceShip> list = list();

        System.out.println(list);
        assertTrue(list.contains(new SpaceShip("Soyuz", 3)));
    }

    @Test
    public void compareLists() {
        List<SpaceShip> list = list();
        list.add(new SpaceShip("Soyuz TM", 3));

        List<SpaceShip> expectedList = new ArrayList<>();
        expectedList.add(new SpaceShip("Soyuz", 3));
        expectedList.add(new SpaceShip("Dragon", 4));
        expectedList.add(new SpaceShip("Proton", 0));
        expectedList.add(new SpaceShip("Soyuz TM", 3));

        assertEquals(expectedList, list);
    }

    private List<SpaceShip> list() {
        List<SpaceShip> list = new ArrayList<>();
        list.add(soyuz);
        list.add(dragon);
        list.add(proton);

        return list;
    }
}
