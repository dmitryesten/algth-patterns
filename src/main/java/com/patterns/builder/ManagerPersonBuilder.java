package com.patterns.builder;

import com.Person;

public class ManagerPersonBuilder {

    private IPersonGenderBuilder person;

    public ManagerPersonBuilder(IPersonGenderBuilder person){
        this.person = person;
    }

    public Person getPerson(){
        return this.person.build();
    }

}
