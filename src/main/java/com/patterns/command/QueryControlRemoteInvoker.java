package com.patterns.command;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryControlRemoteInvoker {

    private static Map<String, Command> commandMap = new HashMap<>();

    public void setCommand(String nameCommand, Command command){
        commandMap.put(nameCommand, command);
    }

    public void setCommandList(String nameCommand, List<Command> commands)  {
        commandMap.put(nameCommand, new MultiCommand(commands));
    }

    public void execute(String commandName) {
        Command command = commandMap.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute();
    }

}

class MultiCommand implements Command {

    private List<Command> listCommands;

    public MultiCommand(List<Command> listCommads) {
        this.listCommands = listCommads;
    }

    @Override
    public void execute() {
        listCommands.stream()
            .peek(com -> System.out.println("Executing the command"+ com.toString()))
            .forEach(Command::execute);
    }
}
