package com.patterns.builder;

import com.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonBuilderTest {

    @Test
    public void build() {
        Person person = new PersonBuilder()
                        .setId(1)
                        .setNickname("Person_1")
                        .build();

        Assert.assertNotNull(person.getId());
        Assert.assertEquals(1, person.getId());
        Assert.assertEquals("Person_1", person.getNickname());
    }
}