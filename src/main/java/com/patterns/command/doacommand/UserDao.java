package com.patterns.command.doacommand;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> listDB = new ArrayList<>();

    public void save(User user) {
        listDB.add(user);
        System.out.println("Прослойка DAO: сохраняем пользователя" + user.toString());
    }

    public void delete(User user) {
        listDB.remove(user);
        System.out.println("Прослойка DAO: удаляем пользователя" + user.toString());
    };

}
