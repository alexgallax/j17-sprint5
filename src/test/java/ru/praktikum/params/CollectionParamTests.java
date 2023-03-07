package ru.praktikum.params;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CollectionParamTests {

    @Parameterized.Parameter
    public List<String> list;

    @Parameterized.Parameter(1)
    public int expectedSize;

    @Parameterized.Parameters(name = "List {0} has size {1}")
    public static Object[][] data() {
        return new Object[][] {
                { List.of("one", "two", "three"), 3 },
                { List.of("one", "two"), 2 },
                { List.of(), 0 }
        };
    }

    @Test
    public void collectionHasSize() {
        assertEquals(expectedSize, list.size());
    }
}
