package test.java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator
{
    @Test
    public void TestIterator1() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hi Jim");
        list.add("Fruit");
        list.add("Veggies");
        list.add("Eggs");
        Iterator <String> it = list.iterator();
        System.out.println(it.next());
    }
//    ArrayList<Integer> numbers = new ArrayList<Integer>();
//    numbers.add(12);
//    numbers.add(4);
//    numbers.add(20);
//    numbers.add(23);
//    Iterator<Integer> it = numbers.iterator();
//    while(it.hasNext()) {
//    Integer i = it.next();
//    if(i < 10) {
//        it.remove();
//    }
//}
//    System.out.println(numbers);
}
