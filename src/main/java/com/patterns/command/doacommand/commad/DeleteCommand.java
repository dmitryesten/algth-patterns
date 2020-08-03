package com.patterns.command.doacommand.commad;

import com.patterns.command.doacommand.ICommandCRUD;
import com.patterns.command.doacommand.ICommandUndo;
import com.patterns.command.doacommand.User;
import com.patterns.command.doacommand.UserDao;

public class DeleteCommand implements ICommandCRUD, ICommandUndo {
    private UserDao userDAO;
    private User user;

    public DeleteCommand(UserDao userDAO, User user){
        this.userDAO = userDAO;
        this.user = user;
    }

    @Override
    public void execute() {
        userDAO.delete(user);
        System.out.println("Прослойка InsertCommand: удалям пользователя" + user.toString());
    }

    @Override
    public void undo() {
        userDAO.save(user);
        System.out.println("Прослойка InsertCommand undo: востанавливаем пользователя" + user.toString());
    }
}
