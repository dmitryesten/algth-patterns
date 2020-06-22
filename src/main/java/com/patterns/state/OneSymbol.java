package com.patterns.state;

public class OneSymbol implements IState{

    private static final char SYMBOL = '1';

    @Override
    public char getSymbol() {
        return SYMBOL;
    }

    @Override
    public char changeSymbol() {
        return getSymbol();
    }


}
