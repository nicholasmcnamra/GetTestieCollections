package rocks.zipcode;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IteratorTest {
    ArrayList<String> arrayList = new ArrayList<String>();


    @Test
    public void iteratorTest() {
        arrayList.add(" it is");
        Iterator<String> iterator = arrayList.iterator();

        String expectedValue = " it is";
        String actualValue = iterator.next();

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void iteratorRemoveTest() {
        arrayList.add("Here");
        arrayList.add(" it is");
        arrayList.add("again");
        Iterator<String> iterator = arrayList.iterator();
        iterator.next();
        iterator.next();
        iterator.remove();

        String expectedValue = "again";
        String actualValue = iterator.next();

        Assert.assertEquals(expectedValue, actualValue);
    }

}
