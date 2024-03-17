package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


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

}
