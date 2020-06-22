package com.patterns.state;

public class ZeroSymbol implements IState {

    private static final char SYMBOL = '0';

    @Override
    public char getSymbol() {
        return SYMBOL;
    }

    @Override
    public char changeSymbol() {
        return getSymbol();
    }

}
