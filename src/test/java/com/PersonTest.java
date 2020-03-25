package com;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void compareTo() {
        Person one = new Person(1, "test1", (short) 20, 178, 60, Gender.FEMALE);
        Person two = new Person(12, "test2", (short) 20, 176, 70, Gender.MALE);
        Assert.assertEquals(0, one.compareTo(two));

        one.setAge( (short) 21);
        Assert.assertEquals(1, one.compareTo(two));
        Assert.assertEquals(-1, two.compareTo(one));
    }
}