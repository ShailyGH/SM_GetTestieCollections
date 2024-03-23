package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap
{
    @Test
    public void testDescTail() {
        var tree = new TreeMap<Integer, Integer>();
        for (int i = 0; i < 10; ++i)
            tree.put(i, i);
        System.out.println(tree.tailMap(9));
        System.out.println(tree.descendingMap().tailMap(4));
    }
    @Test
    public void testAdd() {
        Map<String, Integer> treeMap = new TreeMap<>();
        int expected = 3;

        // Adding elements to the tree map
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);

        int actual = treeMap.get("C");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLastKey()
    {
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
        int expected = 30;

        // Mapping string values to int keys
        treemap.put(10, "Geeks");
        treemap.put(15, "4");
        treemap.put(20, "Geeks");
        treemap.put(25, "Welcomes");
        treemap.put(30, "You");

        int actual = treemap.lastKey();

        Assert.assertEquals(expected, actual);

    }
}
