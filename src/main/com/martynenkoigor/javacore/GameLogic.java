package com.martynenkoigor.javacore;

import java.util.Scanner;

public class GameLogic {
    private final Field field = new Field();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        char user = 'X';
        boolean inProgress = true;
        
        field.printGame();

        while (inProgress) {
            System.out.println("Choose a free field number: ");

            int position = scanner.nextInt();
            
            if (invalidInput(position)) {
                System.out.println("Wrong input");
                continue;
            }

            move(position, user);
            field.printGame();
            inProgress = inProgress(user);


            user = user == 'X' ? '0' : 'X';
        }
    }

    private boolean invalidInput(int num){
        return num > 9 || num < 1;
    }

    private void move(int position, char symbol) {
        field.setField(position - 1, symbol);
    }

    private boolean inProgress(char user) {
        if (field.getField(0) == user && field.getField(1) == user && field.getField(2) == user) {
            System.out.println(user + " won!");
            return false;
        } else if(field.getField(3) == 'X' && field.getField(4) == 'X' && field.getField(5) == 'X') {
            System.out.println(user + " won!");
            return false;
        } else if (field.getField(6) == 'X' && field.getField(7) == 'X' && field.getField(8) == 'X') {
            System.out.println(user + " won!");
            return false;
        } else if (field.getField(0) == 'X' && field.getField(3) == 'X' && field.getField(6) == 'X') {
            System.out.println(user + " won!");
            return false;
        } else if (field.getField(1) == 'X' && field.getField(4) == 'X' && field.getField(7) == 'X') {
            System.out.println(user + " won!");
            return false;
        } else if (field.getField(2) == 'X' && field.getField(5) == 'X' && field.getField(8) == 'X') {
            System.out.println(user + " won!");
            return false;
        } else if (field.getField(0) == 'X' && field.getField(4) == 'X' && field.getField(8) == 'X') {
            System.out.println(user + " won!");
            return false;
        } else if (field.getField(2) == 'X' && field.getField(4) == 'X' && field.getField(6) == 'X') {
            System.out.println(user + " won!");
            return false;
        } else if (field.getField(0) != '1' && field.getField(1) != '2' && field.getField(2) != '3' &&
                field.getField(3) != '4' && field.getField(4) != '5' && field.getField(5) != '6' &&
                field.getField(6) != '7' && field.getField(7) != '8' && field.getField(8) != '9') {
            System.out.println("Draw!");
            return false;
        } else
            return true;
    }
}
