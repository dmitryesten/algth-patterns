package com.algths.search;

import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private final List<Integer> arrayList = Arrays.asList(1, 2 , 3, 45, 123, 345, 678, 7809, 123545);

    @Test
    public void searchNotExistValue() {
        BinarySearch binarySearch = new BinarySearch();
        Assert.assertEquals(-1, binarySearch.search(arrayList, 8));
    }

    @Test
    public void searchExistValue() {
        BinarySearch binarySearch = new BinarySearch();
        Assert.assertEquals(7, binarySearch.search(arrayList, 7809));
    }

    @Test(expected = InvalidParameterException.class)
    public void searchInvalidIndexNegative() {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.search(arrayList, -1, 9,7809);
    }

    @Test(expected = InvalidParameterException.class)
    public void searchInvalidIndex() {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.search(arrayList, 8, 6,7809);
    }
}