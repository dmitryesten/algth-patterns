package com.patterns.command.doacommand;

import java.util.Objects;

public class User {
    public int id;
    public double amount;

    public User(int id, double amount){
        this.id = id;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
            Double.compare(user.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount);
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", amount=" + amount +
            '}';
    }
}