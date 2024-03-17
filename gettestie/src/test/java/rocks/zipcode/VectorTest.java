package rocks.zipcode;
import java.util.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VectorTest {
    Vector<String> testVector = new Vector();
    Collection<String> arrayList = new ArrayList<String>();

    // add(Index, Element), allAll, iterator, equals

    @Test
    public void addWithParametersTest() {
        testVector.add("Who");
        testVector.add("are");
        testVector.add("you");
        testVector.add("to?");
        testVector.add(3, "talking");

        String expectedValue = "talking";
        String actualValue = testVector.get(3);

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void addAllTest() {
        arrayList = Arrays.asList("who", "are", "you");
        testVector.addAll(arrayList);

        int expectedValue = 3;
        int actualValue = testVector.size();

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void iteratorTest() {
        testVector.add("Who");
        testVector.add("are");
        testVector.add("you");
        testVector.add("to?");

        Iterator<String> iterator = testVector.iterator();

        String expectedValue = "Who";
        String actualValue = iterator.next();

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void equalsTest() {
        Vector<String> testVector1 = new Vector<>();
        testVector.add("This");
        testVector1.add("This");

        boolean actualValue = testVector.equals(testVector1);

        Assert.assertTrue(actualValue);
    }
}
