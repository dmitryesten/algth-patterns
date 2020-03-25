package com.patterns.strategy.comparators;

import com.Gender;
import com.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonComparatorTest {

    @Test
    public void compare() {
        Person one = new Person(1, "test1", (short) 20, 178, 60, Gender.FEMALE);
        Person two = new Person(12, "test2", (short) 20, 176, 70, Gender.MALE);

        PersonComparator personComparator = new PersonComparator(new PersonComparatorHeight());
        Assert.assertEquals(0, personComparator.compare(one, two));
    }
}