package com.patterns.state;

public class DefaultSymbol implements IState {


    @Override
    public char getSymbol() {
        return ' ';
    }

    @Override
    public char changeSymbol() {
        return 0;
    }
}
