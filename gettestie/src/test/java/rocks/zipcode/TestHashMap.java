package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap
{
    @Test
    public void testPut()
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Test1", 101);
        Assert.assertFalse(map.isEmpty());
    }
    @Test
    public void testGet()
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Integer expectedValue = 102;
        map.put("Test2", 102);
        Integer actualValue = map.get("Test2");
        Assert.assertEquals(expectedValue, actualValue);
    }
}
