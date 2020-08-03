package com.patterns.command.doacommand;

import com.patterns.command.doacommand.commad.InsertCommand;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionUserInvokerTest {

    @Test
    public void run() {

        UserDao userDAO = new UserDao();
        User user = new User(1, 789.50);
        TransactionUserInvoker transactionUser = new TransactionUserInvoker();
        ICommandCRUD commandCRUD = new InsertCommand(userDAO, user);
        transactionUser.addCommand(commandCRUD::execute);
        transactionUser.run();


        User user2 = new User(999, 789.50);
        ICommandCRUD commandCRUDException = new InsertCommand(userDAO, user);
        transactionUser.addCommand(commandCRUD::execute);
        transactionUser.run();

    }
}