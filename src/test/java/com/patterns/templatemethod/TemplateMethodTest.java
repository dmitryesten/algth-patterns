package com.patterns.templatemethod;

import org.junit.Test;

public class TemplateMethodTest {


    @Test
    public void test(){
        System.out.println("---GROUP DATA--");
        ExtractTransformLoad etl = new GroupTransformData();
        etl.processETL();
        System.out.println("----SORT GROUPED DATA----");

        etl = new SortTransformData();
        etl.processETL();

    }

}
