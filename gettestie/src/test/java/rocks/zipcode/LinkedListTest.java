package rocks.zipcode;

import java.lang.reflect.Array;
import java.util.LinkedList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    LinkedList<Integer> linkedList = new LinkedList<>();

    //set, remove, toArray, offer, indexOf

    @Test
    public void setTest() {
        linkedList.add(0, 1);
        linkedList.set(0, 2);

        Integer expectedIntAtIndex = 2;
        Integer actualIntAtIndex = linkedList.get(0);

        Assert.assertEquals(expectedIntAtIndex, actualIntAtIndex);
    }

    @Test
    public void removeTest() {
        linkedList.add(0, 40);
        linkedList.add(1, 2);
        linkedList.remove(0);

        Integer expectedIntAtIndex = 2;
        Integer actualIntAtIndex = linkedList.get(0);

        Assert.assertEquals(expectedIntAtIndex, actualIntAtIndex);
    }

    @Test
    public void removeFirstTest() {
        linkedList.add(0, 40);
        linkedList.add(1, 2);

        Integer expectedIntAtIndex = 40;
        Integer actualIntAtIndex = linkedList.removeFirst();

        Assert.assertEquals(expectedIntAtIndex, actualIntAtIndex);
    }

    @Test
    public void toArray() {
        linkedList.add(2);
        linkedList.add(1);

        Object [] newArray = linkedList.toArray();

        Integer expectedAtIndex = 2;
        Integer actualAtIndex = (Integer) newArray[0];

        Assert.assertEquals(expectedAtIndex, actualAtIndex);
    }

    @Test
    public void offerTest() {
        linkedList.add(2);
        linkedList.add(1);

        linkedList.offer(20);

        Integer expectedAtIndex = 20;
        Integer actualAtIndex = linkedList.get(2);

        Assert.assertEquals(expectedAtIndex, actualAtIndex);
    }

    @Test
    public void indexOfTest() {
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(20);

        Integer expectedIndex = 2;
        Integer actualIndex = linkedList.indexOf(20);

        Assert.assertEquals(expectedIndex, actualIndex);
    }


}
