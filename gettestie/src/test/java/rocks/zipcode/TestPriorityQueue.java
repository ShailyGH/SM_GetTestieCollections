package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue
{
    @Test
    public void TestPq1() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        String str = "Hi Nolan";
        queue.add(str);
        Assert.assertFalse(queue.isEmpty()); // false
        Assert.assertTrue(queue.contains(str));

    }
    @Test
    public void TestPq2() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        String expected = "Hi Nolan";
        queue.add(expected);
        queue.add("buffer");
        String actual = queue.poll();
        Assert.assertEquals(expected, actual); // true
    }
    @Test
    public void TestPq3() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("Hi Nolan");
        queue.peek();
        Assert.assertFalse(queue.isEmpty()); // false
    }

    @Test
    public void TestPq4() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        String str = "Hi Nolan";
        queue.add(str);
        queue.add(str);
        queue.add(str);
        queue.add(str);
        queue.remove(str);
        Assert.assertFalse(queue.isEmpty()); // false
    }

}
