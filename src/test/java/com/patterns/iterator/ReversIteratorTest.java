package com.patterns.iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversIteratorTest {

    private Integer [] integers;
    private String [] strings;

    @Before
    public void initBefore(){
        integers = new Integer[3];
        strings = new String[3];

        integers[0] = 111;
        integers[1] = 222;
        integers[2] = 333;

        strings[0] = "111";
        strings[1] = "222";
        strings[2] = "333";
    }


    @Test
    public void hasNext() {
        Integer [] integers = new Integer[3];;
        integers[0] = 111;
        integers[1] = 222;
        integers[2] = 333;
        ReversIterator<Integer> reversIterator2 = new ReversIterator<>(integers);

        reversIterator2.next();
        Assert.assertTrue(reversIterator2.hasNext());

    }

    @Test
    public void next() {
        ReversIterator<Integer> reversIterator = new ReversIterator<>(integers);
        Assert.assertNotNull(reversIterator.next());

        ReversIterator<String> reversIteratorString = new ReversIterator<>(strings);
        Assert.assertNotNull(reversIteratorString.next());
    }
}