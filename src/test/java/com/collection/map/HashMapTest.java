package com.collection.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    private Map<Integer, Integer> hashMap = new HashMap<>();
    @Before
    public void before(){
        for(int i = 0; i < 5; i++) {
            hashMap.put(i, i);
        }
    }

    @Test
    public void testPutIfAbsent() {
        Assert.assertNull(hashMap.get(8));
        hashMap.putIfAbsent(8, 8);
        Assert.assertNotNull(hashMap.get(8));
    }

    @Test
    public void testСompute(){
        Assert.assertEquals(new Integer(1), hashMap.get(1));
        hashMap.compute(1, (key, value) ->  key + value );
        Assert.assertEquals(new Integer(2), hashMap.get(1));
    }

    @Test
    public void testСomputeIfAbsent(){
        Assert.assertEquals(new Integer(1), hashMap.get(1));
        hashMap.computeIfAbsent(9, (key) ->  key + 1 );
        Assert.assertEquals(new Integer(10), hashMap.get(9));
    }

}
