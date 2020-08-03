package com.patterns.command.doacommand.commad;

import com.patterns.command.doacommand.ICommandCRUD;
import com.patterns.command.doacommand.ICommandUndo;
import com.patterns.command.doacommand.User;
import com.patterns.command.doacommand.UserDao;


import java.util.stream.Collectors;

public class InsertCommand implements ICommandCRUD, ICommandUndo {

    private UserDao userDAO;
    private User user;
    public InsertCommand(UserDao userDao, User user){
        this.userDAO = userDao;
        this.user = user;
    }

    @Override
    public void execute() {
        userDAO.save(user);
        System.out.println("Прослойка InsertCommand: сохраняем пользователя" + user.toString());
        for (Integer idx: userDAO.listDB.stream().map(s -> s.id).collect(Collectors.toList())) {
            if(idx.equals(999)) {
                try {
                    System.out.println("Прослойка InsertCommand: выбрасывам исключение");
                    throw new Exception("Не валидный Идентификатор");
                } catch (Exception e) {
                    System.out.println("Прослойка InsertCommand: обрабатываем исключение, вызывам UNDO");
                    undo();
                }
            }
        }
    }

    @Override
    public void undo() {
        userDAO.delete(user);
        System.out.println("Прослойка InsertCommand undo: удалям пользователя" + user.toString());
    }

}
