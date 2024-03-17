package rocks.zipcode;
import java.util.HashMap;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashMapTest {
    HashMap<Person, Address> hashMap = new HashMap<>();
    Person person = new Person("Harry", 1985);
    Address address = new Address("55 Main Street", "Washington", "98046");

    // getValue, put, containsValue, containsKey, remove, isEmpty

    @Test
    public void getValueTest() {
        hashMap.put(person, address);

        Address expectedValue = address;
        Address actualValue = hashMap.get(person);

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void putTest() {
        hashMap.put(person, address);

        boolean actualKey = hashMap.containsKey(person);

        Assert.assertTrue(actualKey);
    }

    @Test
    public void containsValueTest() {
        hashMap.put(person, address);

        boolean actualValue = hashMap.containsValue(address);

        Assert.assertTrue(actualValue);
    }

    @Test
    public void containsKeyTest() {
        hashMap.put(person, address);

        boolean actualKey = hashMap.containsKey(person);

        Assert.assertTrue(actualKey);
    }

    @Test
    public void removeTest() {
        hashMap.put(person, address);
        hashMap.remove(person);

        boolean actualContains = hashMap.isEmpty();

        Assert.assertTrue(actualContains);

    }

    @Test
    public void isEmptyTest() {
        hashMap.put(person, address);
        hashMap.clear();

        boolean actualContains = hashMap.isEmpty();

        Assert.assertTrue(actualContains);

    }
}
