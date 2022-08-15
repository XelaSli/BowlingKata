package com.sahli.bowling;

public class Frame {
    private final int firstRoll;
    private final int secondRoll;

    public Frame(int firstRoll, int secondRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }

    int getScore(){
        return firstRoll + secondRoll;
    }
}
