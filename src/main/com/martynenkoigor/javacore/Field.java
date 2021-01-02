package com.martynenkoigor.javacore;

public class Field {
    private final char gamefield[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public void printGame() {
        System.out.println(gamefield[0] + " | " + gamefield[1] + " | " + gamefield[2]);
        System.out.println("_________");
        System.out.println(gamefield[3] + " | " + gamefield[4] + " | " + gamefield[5]);
        System.out.println("_________");
        System.out.println(gamefield[6] + " | " + gamefield[7] + " | " + gamefield[8]);
    }

    public char getField(int position) {
        return gamefield[position];
    }

    public void setField(int position, char value) {
        gamefield[position] = value;
    }
}
