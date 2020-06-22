package com.algths.structure.heap;

public interface IHeap {

    boolean isParent(int index);

    int getHeight();

    int get(int index);

    int put(Node node);



}
