package com.patterns.builder;

import com.Gender;
import org.junit.Assert;
import org.junit.Test;

public class BuilderManagerPersonTest {

    @Test
    public void getPerson() {
        IPersonGenderBuilder women = new WomenGenderBuilder();
        ManagerPersonBuilder managerWomanBuilder = new ManagerPersonBuilder(women);

        Assert.assertEquals(Gender.FEMALE, managerWomanBuilder.getPerson().getGender());

        IPersonGenderBuilder man = new ManGenderBuilder();
        ManagerPersonBuilder managerManBuilder = new ManagerPersonBuilder(man);

        Assert.assertEquals(Gender.MALE, managerManBuilder.getPerson().getGender());
    }
}