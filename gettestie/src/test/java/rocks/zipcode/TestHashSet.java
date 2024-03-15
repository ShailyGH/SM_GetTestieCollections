package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

    @Test
    public void testAdd()
    {
        HashSet<String> h = new HashSet<String>();
        Integer expected = 3;

        h.add("Test1");
        h.add("Test2");
        h.add("Test3");

        Integer actual = h.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClear()
    {
        HashSet<String> h = new HashSet<String>();
        Integer expected = 0;

        h.add("Test1");
        h.add("Test2");
        h.add("Test3");

        h.clear();

        Integer actual = h.size();

        Assert.assertEquals(expected, actual);
    }
}
