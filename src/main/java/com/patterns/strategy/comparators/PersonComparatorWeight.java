package com.patterns.strategy.comparators;

import com.Person;

import java.util.Comparator;

public class PersonComparatorWeight implements Comparator<Person> {
    @Override
    public int compare(Person personOne, Person personTwo) {
        if (personOne.getWeight() == personTwo.getWeight()) {
            return 0;
        } else if (personOne.getWeight() > personTwo.getWeight()){
            return 1;
        } else
            return -1;
    }
}
