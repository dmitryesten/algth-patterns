package com.patterns.templatemethod;

public class SortTransformData implements ExtractTransformLoad {

    @Override
    public void transformData() {
        System.out.println("Sort process is transform data");
    }
}
