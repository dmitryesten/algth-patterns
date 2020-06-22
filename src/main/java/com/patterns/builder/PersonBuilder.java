package com.patterns.builder;

import com.Gender;
import com.Person;

public class PersonBuilder {

    private int id;
    private String nickname;
    private short age;
    private double height;
    private double weight;
    private Gender gender;

    PersonBuilder setId(int id) {
        this.id = id;
        return this;
    }

    PersonBuilder setNickname(String nickname){
        this.nickname = nickname;
        return this;
    }

    PersonBuilder setAge(short age){
        this.age = age;
        return this;
    }

    PersonBuilder setHeight(double height){
        this.height = height;
        return this;
    }

    PersonBuilder setWeight(double weight){
        this.weight = weight;
        return this;
    }

    PersonBuilder setGender(Gender gender){
        this.gender = gender;
        return this;
    }

    Person build(){
        Person person = new Person();
            person.setId(id);
            person.setNickname(nickname);
            person.setAge(age);
            person.setHeight(height);
            person.setWeight(weight);
            person.setGender(gender);
        return person;
    }

}
