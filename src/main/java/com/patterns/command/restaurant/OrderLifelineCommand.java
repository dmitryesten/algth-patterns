package com.patterns.command.restaurant;

import java.util.List;

public class OrderLifelineCommand implements CommandRestaurant {

    private List<CommandRestaurant> lifeline;

    public OrderLifelineCommand(List<CommandRestaurant> list){
        lifeline = list;
    }

    @Override
    public void executor() {
        lifeline.forEach(command -> command.executor());
    }

}
