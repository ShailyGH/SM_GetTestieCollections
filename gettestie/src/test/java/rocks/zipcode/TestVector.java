package test.java.rocks.zipcode;

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
}
