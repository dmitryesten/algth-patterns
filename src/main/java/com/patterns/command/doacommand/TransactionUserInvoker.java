package com.patterns.command.doacommand;

import java.util.ArrayList;
import java.util.List;

public class TransactionUserInvoker {

    private List<ICommandCRUD> list = new ArrayList<>();

    public TransactionUserInvoker(List<ICommandCRUD> transation){
        this.list = transation;
    }

    public TransactionUserInvoker(ICommandCRUD commandCRUD){
        this.list.add(commandCRUD);
    }

    public TransactionUserInvoker() {}

    public void addCommand(ICommandCRUD command) {
        list.add(command);
    }

    public void run(){
        list.stream().forEach(command -> command.execute());
    }

}
