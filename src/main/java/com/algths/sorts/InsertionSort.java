package com.algths.sorts;

import com.patterns.strategy.ISort;
import java.util.List;

public class InsertionSort implements ISort {

    public List<Integer> sort(List<Integer> unsortedList) {

        int indexUnsortedList = 1;

        while (indexUnsortedList < unsortedList.size()) {
            int indexSortedList = indexUnsortedList;

            while (indexSortedList > 0 && unsortedList.get(indexSortedList - 1) > unsortedList.get(indexSortedList)){
                swap(unsortedList, indexSortedList);
                indexSortedList = indexSortedList - 1;
            }

            indexUnsortedList = indexUnsortedList + 1;
        }
        return unsortedList;
    }

    private static void swap(List<Integer> unsortedList, int indexSortedList) {
        int temp = unsortedList.get(indexSortedList);
        unsortedList.set(indexSortedList,  unsortedList.get(indexSortedList - 1));
        unsortedList.set(indexSortedList - 1, temp);
    }

}
