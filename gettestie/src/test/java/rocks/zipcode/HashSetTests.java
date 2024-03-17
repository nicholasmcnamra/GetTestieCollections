package rocks.zipcode;
import java.util.HashSet;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashSetTests {

    HashSet<Integer> hashSet = new HashSet<>();


    // add, size, contains, remove


    @Test
    public void addTest() {
        hashSet.add(1);
        hashSet.add(2);

        boolean actualInHashset = hashSet.contains(2);

        Assert.assertTrue(actualInHashset);
        hashSet.clear();
    }

    @Test
    public void isEmptyTest() {
        hashSet.add(1);
        hashSet.add(2);

        hashSet.clear();
        boolean actualInHashset = hashSet.isEmpty();

        Assert.assertTrue(actualInHashset);
    }

    @Test
    public void sizeTest() {
        hashSet.add(1);
        hashSet.add(2);

        Integer expectedInHashSet = 2;
        Integer actualInHashset = hashSet.size();

        Assert.assertEquals(expectedInHashSet, actualInHashset);
    }

    @Test
    public void containsTest() {
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(700);
        hashSet.add(80);

        boolean actualInHashset = hashSet.contains(80);

        Assert.assertTrue(actualInHashset);
        hashSet.clear();
    }

    @Test
    public void removeTest() {
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(700);
        hashSet.add(80);

        hashSet.remove(700);

        boolean actualInHashset = (!hashSet.contains(700));

        Assert.assertTrue(actualInHashset);
        hashSet.clear();
    }
}
