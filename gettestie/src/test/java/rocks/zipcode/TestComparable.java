package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestComparable {

    @Test
  public void testComparable(){
      ArrayList<String> arrayList = new ArrayList<>();
      arrayList.add("a");
      arrayList.add("b");
      arrayList.add("c");
      Integer expected = -1;
      Integer actual = arrayList.get(0).compareTo(arrayList.get(1));
      Assert.assertEquals(expected, actual);
  }
    @Test
    public void testArraySort() {

        int[] myActualArray = new int[] {9, 6, 10, 7};
        int[] mySortedArray = new int[] {6, 7, 9, 10};

        // Sorting the array
        Arrays.sort(myActualArray);

        Assert.assertArrayEquals(mySortedArray, myActualArray);
    }

    @Test
    public void testCompareTo() {
        List<String> expectedMarvelHeroes = new ArrayList<>();
        List<String> actualMarvelHeroes = new ArrayList<>();
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("SpiderMan ");
        myArray.add("Wolverine ");
        myArray.add("Xavier ");
        myArray.add("Cyclops ");

        actualMarvelHeroes.addAll(myArray);

        expectedMarvelHeroes.add("SpiderMan ");
        expectedMarvelHeroes.add("Wolverine ");
        expectedMarvelHeroes.add("Xavier ");
        expectedMarvelHeroes.add("Cyclops ");

        Assert.assertTrue(expectedMarvelHeroes.equals(actualMarvelHeroes));
    }
}
