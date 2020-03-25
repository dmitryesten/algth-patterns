package com.patterns.strategy.comparators;

import com.Person;

import java.util.Comparator;

public class PersonComparatorHeight implements Comparator<Person> {
    @Override
    public int compare(Person personOne, Person personTwo) {
        if (personOne.getHeight() == personTwo.getHeight()) {
            return 0;
        } else if (personOne.getHeight() > personTwo.getHeight()){
            return 1;
        } else
            return -1;
    }
}
