package com.patterns.prototype;

import com.patterns.command.restaurant.Client;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientCopedTest {

    @Test
    public void copy() throws CloneNotSupportedException {
        ClientCoped client = new ClientCoped();
        client.setIdClientCoped(1L);
        client.setNameClientCoped("Client");

        ClientCoped copyClient = client.copy();
        Assert.assertEquals(client.getIdClientCoped(), copyClient.getIdClientCoped());
        Assert.assertEquals(client.getNameClientCoped(), copyClient.getNameClientCoped());

        ClientCoped cloneClient = client.clone();
        Assert.assertEquals(client.getIdClientCoped(), cloneClient.getIdClientCoped());
        Assert.assertEquals(client.getNameClientCoped(), cloneClient.getNameClientCoped());
    }
}