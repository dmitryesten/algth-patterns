package com.patterns.command;

public class UserQuery {

    public String getId(int id) {
        System.out.println("User { id = "+ id + "}");
        return  "User { id = "+ id + "}";
    }
}
