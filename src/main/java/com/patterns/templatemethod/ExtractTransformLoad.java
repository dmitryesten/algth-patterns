package com.patterns.templatemethod;

public interface ExtractTransformLoad {

    default void processETL(){
        extractData();
        transformData();
        loadFileData();
    }

    void transformData();

    default void extractData(){
        System.out.println("The algorithms of extract is ready, it's same for each process");
    }

    default void loadFileData(){
        System.out.println("The algorithms of load is ready, it's same for each process");
    }



}
