package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

    @Test
    public void testAdd() {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.addFirst(0);
        list.addLast(2);
        Iterator iterator = list.iterator();
        Integer num = 0;
        while (iterator.hasNext()) {
            Assert.assertEquals(num, iterator.next());
            num++;
        }
    }

    @Test
    public void testRemove()
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(50);
        list.add(51);
        list.add(52);
        list.remove(0);
        list.removeLast();
        int first = list.getFirst();
        Assert.assertEquals(51, first);
    }

}
