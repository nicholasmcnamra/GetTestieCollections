package rocks.zipcode;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {
    ArrayList<Integer> arrayList = new ArrayList<>();

    @Test
    public void addTest() {
        arrayList.add(1);
        arrayList.add(2);

        boolean actualInArrayList = arrayList.contains(2);

        Assert.assertTrue(actualInArrayList);
        arrayList.clear();
    }

    @Test
    public void isEmptyTest() {
        arrayList.add(1);
        arrayList.add(2);

        arrayList.clear();
        boolean actualInArrayList = arrayList.isEmpty();

        Assert.assertTrue(actualInArrayList);
    }

    @Test
    public void sizeTest() {
        arrayList.add(1);
        arrayList.add(2);

        Integer expectedInArrayList = 2;
        Integer actualInArrayList = arrayList.size();

        Assert.assertEquals(expectedInArrayList, actualInArrayList);
    }

    @Test
    public void containsTest() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(700);
        arrayList.add(80);

        boolean actualInArrayList = arrayList.contains(80);

        Assert.assertTrue(actualInArrayList);
        arrayList.clear();
    }

    @Test
    public void removeTest() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(700);
        arrayList.add(80);

        arrayList.remove(2);

        boolean actualInArrayList = (!arrayList.contains(700));

        Assert.assertTrue(actualInArrayList);
        arrayList.clear();
    }
}
