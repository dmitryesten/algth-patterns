package com.patterns.command.restaurant;

import java.util.HashMap;
import java.util.Map;

public class EmulatorRestaurant {

    private final Map<String, CommandRestaurant> commandMap = new HashMap<>();

    public void register(String commandName, CommandRestaurant command) {
        commandMap.put(commandName, command);
    }

    public void execute(String commandName) {
        CommandRestaurant command = commandMap.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.executor();
    }

}
