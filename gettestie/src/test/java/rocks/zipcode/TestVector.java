package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector
{
    @Test
    public void testIsEmpty()
    {
//       int n = 5;
        Vector<Integer> vec1 = new Vector<Integer>();
        System.out.println("Vector: " + vec1);
        System.out.println("Is the Vector empty? " + vec1.isEmpty());
    }

    @Test
    public void testremoveAll()
    {
        // Creating an empty Vector
        Vector<Integer> vec1 = new Vector<Integer>();

        // Use add() method to add elements in the Vector
        vec1.add(4);
        vec1.add(6);
        vec1.add(8);
        vec1.add(12);
        vec1.add(24);

        // Output the Vector
        System.out.println("Vector: " + vec1);

        // Creating an empty Vector

        // Use add() method to add elements in the Vector
    }
    @Test
    public void testAdd()
    {
        Vector<String> vector = new Vector<String>();
        Integer expected = 3;

        vector.add("SampleString1");
        vector.add("SampleString2");
        vector.add("SampleString3");

        Integer actual = vector.size();

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testClone() {
        Vector<String> vector = new Vector<String>();

        vector.add("Hello world 1");
        vector.add("Hello world 2");
        vector.add("Hello world 3");

        Object copy_vector = vector.clone();

        Assert.assertEquals(vector, copy_vector);
    }
}
