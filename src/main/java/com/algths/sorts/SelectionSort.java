package com.algths.sorts;

import com.patterns.strategy.ISort;

import java.util.List;

public class SelectionSort implements ISort {
    @Override
    public List<Integer> sort(List<Integer> unsortedList) {
        for (int i = 0; i < unsortedList.size() - 1;  i++) {
            int minimalIndex = i;

            for(int j = i + 1; j < unsortedList.size(); j++){
                if(unsortedList.get(j) < unsortedList.get(minimalIndex)) {
                    minimalIndex = j;
                }
            }
            swap(unsortedList, i, minimalIndex);
        }
        return unsortedList;
    }

    private static void swap(List<Integer> unsortedList, int leftIndex, int rightIndex) {
        int temp = unsortedList.get(leftIndex);
        unsortedList.set(leftIndex, unsortedList.get(rightIndex));
        unsortedList.set(rightIndex, temp);

    }

}
