package rocks.zipcode;

import java.util.ArrayDeque;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayDequeTest {
    ArrayDeque<String> testDeque = new ArrayDeque<>();

    // addFirst, addLast, getFirst, getLast

    @Test
    public void addFirst() {
        testDeque.add("First");
        testDeque.add("Second");
        testDeque.addFirst("BeforeFirst");

        String expectedFirst = "BeforeFirst";
        String actualFirst = testDeque.getFirst();

        Assert.assertEquals(expectedFirst, actualFirst);
    }

    @Test
    public void addLast() {
        testDeque.add("First");
        testDeque.add("Second");
        testDeque.add("Third");
        testDeque.addLast("This one!");

        String expectedLast = "This one!";
        String actualLast = testDeque.getLast();

        Assert.assertEquals(expectedLast, actualLast);
    }

    @Test
    public void getFirst() {
        testDeque.add("Second");
        testDeque.add("First");

        String expectedFirst = "Second";
        String actualFirst = testDeque.getFirst();

        Assert.assertEquals(expectedFirst, actualFirst);
    }

    @Test
    public void getLast() {
        testDeque.add("Second");
        testDeque.add("First");
        testDeque.add("Third");

        String expectedLast = "Third";
        String actualLast = testDeque.getLast();

        Assert.assertEquals(expectedLast, actualLast);
    }
}
