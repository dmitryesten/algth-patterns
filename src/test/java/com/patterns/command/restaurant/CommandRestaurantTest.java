package com.patterns.command.restaurant;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class CommandRestaurantTest {

    @Test
    public void testRestaurant(){
        Client client = new Client();
        Waiter waiter = new Waiter();
        Cooker cooker = new Cooker();

        CommandRestaurant commandClient = client::makeOrder;
        CommandRestaurant waiter2 = () ->{ waiter.takeOrderClient("123"); waiter.moveKitchen();};
        CommandRestaurant commandCooler = () -> {cooker.cookingOrder(); cooker.callReadyOrder();};

        List<CommandRestaurant> commandsOrder = new LinkedList<>();
        commandsOrder.add(commandClient);
        commandsOrder.add(waiter2);
        commandsOrder.add(commandCooler);

        OrderLifelineCommand orderLifelineCommand = new OrderLifelineCommand(commandsOrder);
        orderLifelineCommand.executor();
    }

}