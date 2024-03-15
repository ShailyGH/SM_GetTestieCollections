package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList
{
    @Test
    public void testIsEmpty()
    {
        ArrayList<String> arr1 = new ArrayList<String>();
        Assert.assertTrue(arr1.isEmpty());
    }
    @Test
    public void testAdd()
    {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++)
        {
            arr1.add(i);
        }
        Assert.assertFalse(arr1.isEmpty());
    }

    @Test
    public void testRemove()
    {
        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("Test1");
        arr1.remove(0);

        Assert.assertTrue(arr1.isEmpty());
    }

}
