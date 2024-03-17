package rocks.zipcode;
import java.util.Stack;
import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStack {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void stackPopTest() {
        Stack<String> stack= new Stack<>();
        stack.push("Hello");
        stack.push("World");

        stack.pop();

        String expectedTopElementInStack = "Hello";
        String actualTopElementInStack = stack.peek();

        Assert.assertEquals(expectedTopElementInStack, actualTopElementInStack);
    }

    @Test
    public void stackPeekest() {
        Stack<String> stack= new Stack<>();
        stack.push("Hello");
        stack.push("World");

        String expectedTopElementInStack = "World";
        String actualTopElementInStack = stack.peek();

        Assert.assertEquals(expectedTopElementInStack, actualTopElementInStack);

    }

    @Test
    public void stackEmptyTest() {
        Stack<String> stack= new Stack<>();
        stack.push("Hello");
        stack.push("World");

        stack.pop();
        stack.pop();

        boolean actualInStack = stack.isEmpty();

        Assert.assertTrue(actualInStack);
    }

}
