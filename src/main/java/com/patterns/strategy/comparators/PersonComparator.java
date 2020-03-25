package com.patterns.strategy.comparators;

import com.Person;

import java.util.Comparator;

public class PersonComparator {

    private Comparator<Person> personComparator;

    public PersonComparator(Comparator<Person> personComparator){
        this.personComparator = personComparator;
    }

    public int compare(Person personOne, Person personTwo){
        return personComparator.compare(personOne, personOne);
    }

}
