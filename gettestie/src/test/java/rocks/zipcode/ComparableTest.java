package rocks.zipcode;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComparableTest implements Comparable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    //do this one again
    @Test
    public void comparableTest() {
        int n = 1;
        int c = 1;

        int expectedComparison = this.compareTo(c);
        int actualComparison = this.compareTo(n);

        Assert.assertEquals(expectedComparison, actualComparison);
    }
}
