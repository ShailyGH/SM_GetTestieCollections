package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet
{
    @Test
    public void testAdd()
    {
        Set<String> ts = new TreeSet<>();
        int expected = 3;

        // Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");

        int actual = ts.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAccess()
    {
        Set<String> ts = new TreeSet<>();

        // Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");

        Assert.assertTrue(ts.contains("Geeks"));
    }
}
