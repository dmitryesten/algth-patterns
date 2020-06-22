package com.patterns.collection.map;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    private Map<Integer, String> hashMap;

    @Before
    public void before() {
        hashMap = new HashMap<>();
    }

    @Test
    public void test() {
        hashMap.put(null, "Омск");
        hashMap.put(null, "a");
        System.out.println(hashMap.get(null));

        hashMap.put(11, null);
        hashMap.put(12, null);
        System.out.println(hashMap.get(11));

    }

}
