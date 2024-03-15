package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception
    {

    }

    @org.junit.After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testIsEmpty()
    {
        Stack<String> stack = new Stack<>();
        Assert.assertTrue(stack.isEmpty());
    }

    @org.junit.Test
    public void testPush() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @org.junit.Test
    public void testPop() {
        Stack<String> stack = new Stack<>();
        Integer expected = 2;
        stack.push("Hello world 1");
        stack.push("Hello world 2");
        stack.push("Hello world 3");

        stack.pop();
        Integer actual = stack.size();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testPeek() {
        Stack<String> stack = new Stack<>();
        String expected = "Hello world 3";

        stack.push("Hello world 1");
        stack.push("Hello world 2");
        stack.push("Hello world 3");

        String actual = stack.peek();

        Assert.assertEquals(expected, actual);
    }



}
