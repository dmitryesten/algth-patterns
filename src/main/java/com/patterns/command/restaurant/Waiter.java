package com.patterns.command.restaurant;

public class Waiter {

    public void takeOrderClient(String idClient){
        System.out.println("The order of id_client"+ idClient +" is took. ");
    }

    public void moveKitchen(){
        System.out.println("The order is moved to the kitchen");
    }

}
