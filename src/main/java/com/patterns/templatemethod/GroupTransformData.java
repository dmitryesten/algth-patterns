package com.patterns.templatemethod;

public class GroupTransformData implements ExtractTransformLoad {

    @Override
    public void transformData() {
        System.out.println("Group process is transform data");
    }

}
