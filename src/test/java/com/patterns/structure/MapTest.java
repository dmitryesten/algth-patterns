package com.patterns.structure;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    private Map<String, String> hashMap = new HashMap<>();

    @Test
    public void tests(){
        hashMap.put("Anna", "asdsad");
        hashMap.put(null, "tutu");
        hashMap.put(null, "tutu");
        //System.out.println(hashMap.get(null));
        hashMap.put(null, "tutu2");
        System.out.println(hashMap.get(null));

    }


}
