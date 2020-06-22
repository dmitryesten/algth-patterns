package com.patterns;

import com.patterns.observer.EventNotifier;
import org.junit.Test;

import java.util.Random;

public class ObserverTest {

    @Test
    public void test() {
        EventNotifier eventNotifier = new EventNotifier("TEst");
        System.out.println("Create observable generator state = " + eventNotifier.getStateNotifier());


        Random rand = new Random();
        System.out.println(this.hashCode());

    }

}
