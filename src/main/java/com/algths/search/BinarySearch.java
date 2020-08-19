package com.algths.search;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.NoSuchElementException;

public class BinarySearch<T extends Number> {

    public int search(List<T> sortedList, T searchedValue) {
        return search(sortedList, 0, sortedList.size(), searchedValue);
    }

    public int search(List<T> sortedList, int indexLeft, int indexRight, T searchedValue){
        if(indexLeft < 0 || indexRight < 0 || (indexLeft > indexRight)) {
            throw new InvalidParameterException("The value of index parameter is not valid");
        }
        if(sortedList.size() == 0){
            throw new InvalidParameterException("The sorted list is empty");
        }
        int leftIndex = indexLeft;
        int rightIndex = indexRight;
        int resultIndex = 0;

        if(!sortedList.contains(searchedValue)){
            resultIndex = -1;
        }

        while (leftIndex <= rightIndex) {
            int middleIndex = (rightIndex + leftIndex) / 2;
            if (sortedList.get(middleIndex).intValue() == searchedValue.intValue()){
                resultIndex = middleIndex;
                break;
            }

            if(sortedList.get(middleIndex).intValue() < searchedValue.intValue()){
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }

        return resultIndex;
    }

}
