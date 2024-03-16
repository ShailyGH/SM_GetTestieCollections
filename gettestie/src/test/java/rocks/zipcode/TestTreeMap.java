package test.java.rocks.zipcode;

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
}
