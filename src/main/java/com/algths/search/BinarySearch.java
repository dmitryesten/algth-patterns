package com.algths.search;

import java.util.List;

public class BinarySearch {

    private int left;
    private int right;
    private int middle;

    private List<Integer> sortedList;

    public BinarySearch(List<Integer> sortedList) {
        this.sortedList = sortedList;
    }

    private int search(List<Integer> sortedList, int value) {

        for(int i = 0; i < sortedList.size() / 2; i++) {

            if(sortedList.get(i) < value){

            }

        }
        return 0;
    }


}
