package com.algths.sorts;

import com.patterns.strategy.ISort;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InsertionSortTest {

    private ISort sort = new InsertionSort();

    @Test
    public void test(){
        List<Integer> unsortedList = Stream.of(10, 15, 1, 0, 3).collect(Collectors.toCollection(ArrayList::new));
        List<Integer> expected = Stream.of(0, 1, 3, 10, 15).collect(Collectors.toCollection(ArrayList::new));
        Assert.assertEquals(expected, sort.sort(unsortedList));
    }

}