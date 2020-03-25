package com.patterns.strategy;

import com.Gender;
import com.Person;
import com.algths.sorts.InsertionSort;
import com.algths.sorts.SelectionSort;
import com.patterns.strategy.comparators.PersonComparator;
import com.patterns.strategy.comparators.PersonComparatorHeight;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ListSortStrategyTest {

    @Test
    public void test() {
        List<Integer> unsortedList = Stream.of(10, 15, 1, 0, 3).collect(Collectors.toCollection(ArrayList::new));
        List<Integer> expected = Stream.of(0, 1, 3, 10, 15).collect(Collectors.toCollection(ArrayList::new));

        ListSortStrategy sortStrategy = new ListSortStrategy(new InsertionSort());

        Assert.assertEquals(expected, sortStrategy.sort(unsortedList));

        sortStrategy = new ListSortStrategy(new SelectionSort());

        Assert.assertEquals(expected, sortStrategy.sort(unsortedList));
    }
}