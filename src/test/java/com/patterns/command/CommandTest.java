package com.patterns.command;

import com.patterns.command.restaurant.*;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class CommandTest {

    @Test
    public void test(){

        UserQuery userQuery = new UserQuery();

        List<Command> listUserCommand = new LinkedList<>();
        Command command = () -> { userQuery.getId(1); };
        Command command2 = () -> { userQuery.getId(123); };
        Command command3 = () -> { userQuery.getId(234); };

        listUserCommand.add(command);
        listUserCommand.add(command2);
        listUserCommand.add(command3);

        Command commandPackageSearchUser = new MultiCommand(listUserCommand);
        new MultiCommand(listUserCommand).execute();
        QueryControlRemoteInvoker queryControlRemote = new QueryControlRemoteInvoker();

        queryControlRemote.setCommand("searchUsers", commandPackageSearchUser);
        queryControlRemote.execute("searchUsers");

    }

}