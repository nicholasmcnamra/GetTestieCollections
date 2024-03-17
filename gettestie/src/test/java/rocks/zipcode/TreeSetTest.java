package rocks.zipcode;
import java.util.TreeSet;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeSetTest {
    TreeSet<String> treeSet = new TreeSet<>();

    // first, last, floor, lower

    @Test
    public void firstTest() {
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("c");

        String expectedValue = "a";
        String actualValue = treeSet.first();

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void lastTest() {
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("c");

        String expectedValue = "c";
        String actualValue = treeSet.last();

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void floorTest() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(29);
        treeSet.add(30);

        Integer expectedValue = 30;
        Integer actualValue = treeSet.floor(34);

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void lowerTest() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(29);
        treeSet.add(30);

        Integer expectedValue = 30;
        Integer actualValue = treeSet.lower(34);

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void higherTest() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(29);
        treeSet.add(30);

        Integer expectedValue = 30;
        Integer actualValue = treeSet.higher(29);

        Assert.assertEquals(expectedValue, actualValue);
    }
}
