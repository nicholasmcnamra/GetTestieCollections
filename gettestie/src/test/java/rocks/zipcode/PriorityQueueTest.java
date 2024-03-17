package rocks.zipcode;
import java.util.PriorityQueue;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class PriorityQueueTest {
    PriorityQueue<String> priorityQueue = new PriorityQueue<>();

    @Test
    public void removeIfTest() {
        priorityQueue.add("P");
        priorityQueue.add("B");
        priorityQueue.add("A");

        priorityQueue.remove("B");

        int expectedSize = 2;
        int actualSize = priorityQueue.size();

        Assert.assertEquals(expectedSize, actualSize);
    }
}
