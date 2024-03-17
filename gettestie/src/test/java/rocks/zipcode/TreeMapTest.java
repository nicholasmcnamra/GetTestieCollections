package rocks.zipcode;
import java.util.*;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeMapTest {

    TreeMap<Integer, String> treeMap = new TreeMap<>();

    // containKey, containsValue, entrySet, values

    @Test
    public void containsKeyTest() {
        treeMap.put(1, "Orange");

        boolean actualHasOne = treeMap.containsKey(1);

        Assert.assertTrue(actualHasOne);
    }

    @Test
    public void containsValueTest() {
        treeMap.put(1, "Orange");

        boolean actualHasOrange = treeMap.containsValue("Orange");

        Assert.assertTrue(actualHasOrange);
    }

    @Test
    public void entrySetTest() {
        treeMap.put(1, "Orange");
        treeMap.put(2, "Lemon");

        int expectedEntrySetSize = 2;
        int actualEntrySetSize = treeMap.entrySet().size();

        Assert.assertEquals(expectedEntrySetSize, actualEntrySetSize);
    }

    @Test
    public void valuesTreeMapTest() {
        treeMap.put(1, "Chocolate");
        treeMap.put(2, "Strawberry");
        Collection list = new ArrayList<>();
        list.add("Chocolate");
        list.add("Strawberry");

         boolean expectedValues = list.contains("Chocolate");
         boolean actualValues = treeMap.values().contains("Chocolate");

         Assert.assertEquals(expectedValues,actualValues);
    }
}
