package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDeque {
    @Test
    public void testAdd()
    {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(1);
        deque.addFirst(0);
        deque.addLast(2);
        Iterator iterator = deque.iterator();
        Integer num = 0;
        while(iterator.hasNext())
        {
            Assert.assertEquals(num, iterator.next());
            num ++;
        }
    }

    @Test
    public void testRemove()
    {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(50);
        deque.add(51);
        deque.add(52);
        deque.remove(51);
        deque.removeLast();
        int first = deque.getFirst();
        Assert.assertEquals(50, first);
    }

}
