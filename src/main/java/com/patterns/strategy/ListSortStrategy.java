package com.patterns.strategy;

import java.util.List;

public class ListSortStrategy {

    private ISort sortObject;

    public ListSortStrategy(ISort sort) {
        this.sortObject = sort;
    }

    public List<Integer> sort(List<Integer> unsortedList) {
        return sortObject.sort(unsortedList);
    }

}
