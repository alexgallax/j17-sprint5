package ru.praktikum.maps;

import org.junit.Test;
import ru.praktikum.SpaceShip;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MapsTests {

    @Test
    public void getByKey() {
        Map<String, SpaceShip> map = map();

        assertEquals(new SpaceShip("Soyuz", 3), map.get("soyuz"));
    }

    @Test
    public void addByKey() {
        Map<String, SpaceShip> map = map();
        map.put("soyuz tm", new SpaceShip("Soyuz", 3));

        System.out.println(map);
        assertEquals(4, map.size());
    }

    @Test
    public void updateByKey() {
        Map<String, SpaceShip> map = map();
        map.put("soyuz", new SpaceShip("Mark 5", 100));

        System.out.println(map);
        assertEquals(3, map.size());
    }

    @Test
    public void removeByKey() {
        Map<String, SpaceShip> map = map();
        map.remove("soyuz");

        System.out.println(map);
        assertEquals(2, map.size());
    }

    @Test
    public void containsElement() {
        Map<String, SpaceShip> map = map();

        assertTrue(map.containsKey("soyuz"));
        assertTrue(map.containsValue(new SpaceShip("Soyuz", 3)));
    }

    @Test
    public void getAllEntries() {
        Map<String, SpaceShip> map = map();

        for (Map.Entry<String, SpaceShip> entry : map.entrySet()) {
            System.out.printf("%s: %s", entry.getKey(), entry.getValue());
        }
    }

    @Test
    public void getAllKeys() {
        Map<String, SpaceShip> map = map();

        System.out.println(map.keySet());
        assertEquals(3, map.keySet().size());
    }

    @Test
    public void getAllValues() {
        Map<String, SpaceShip> map = map();

        System.out.println(map.values());
        assertEquals(3, map.values().size());
    }

    @Test
    public void createMapWithCompositeKey() {
        Map<SpaceShip, String> map = new HashMap<>();
        map.put(new SpaceShip("Soyuz", 3), "one");
        map.put(new SpaceShip("Dragon", 4), "two");
        map.put(new SpaceShip("Proton", 0), "three");

        System.out.println(map);
        assertEquals("one", map.get(new SpaceShip("Soyuz", 3)));
    }

    private Map<String, SpaceShip> map() {
        Map<String, SpaceShip> map = new HashMap<>();
        map.put("soyuz", new SpaceShip("Soyuz", 3));
        map.put("dragon", new SpaceShip("Dragon", 4));
        map.put("proton", new SpaceShip("Proton", 0));

        return map;
    }
}
