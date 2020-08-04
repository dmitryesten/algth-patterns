package com.patterns.iterator;



public class ReversIterator<T>  implements Iterator<T> {

    private T[] arrayElements;
    private int index;

    public ReversIterator(T[] arrayElements) {
        this.arrayElements = arrayElements;
        this.index = arrayElements.length - 1;
    }

    @Override
    public boolean hasNext() {

        return arrayElements.length - 1 >  index;
    }

    @Override
    public T next() {
        return arrayElements[index--];
    }
}
