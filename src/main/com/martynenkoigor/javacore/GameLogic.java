package com.martynenkoigor.javacore;

import java.util.Scanner;

public class GameLogic {
    Field field = new Field();
    Scanner scanxo = new Scanner(System.in);
    char user = 'X';
    boolean inProgress = true;
    boolean correctInput;


    public void start() {
        field.printField();

        while (inProgress) {
            System.out.println("Choose a free field number: ");

            int num = scanxo.nextInt();

            correctInput = putXO(num, user);

            if (correctInput == false) {
                System.out.println("Wrong input");
                continue;
            }

            field.printField();

            if (user == 'X') {
                user = '0';
            } else {
                user = 'X';
            }

            inProgress = checkWinner();



        }
    }



    private boolean putXO(int num, char symbol) {

        if (num > 9 || num < 1) {
            return false;
        }
        field.getGamefield()[num - 1] = symbol;

        return true;
    }

    private boolean checkWinner() {
        if (field.getGamefield()[0] == 'X' && field.getGamefield()[1] == 'X' && field.getGamefield()[2] == 'X') {
            System.out.println("X won!");
            return false;
        } else if(field.getGamefield()[3] == 'X' && field.getGamefield()[4] == 'X' && field.getGamefield()[5] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.getGamefield()[6] == 'X' && field.getGamefield()[7] == 'X' && field.getGamefield()[8] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.getGamefield()[0] == 'X' && field.getGamefield()[3] == 'X' && field.getGamefield()[6] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.getGamefield()[1] == 'X' && field.getGamefield()[4] == 'X' && field.getGamefield()[7] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.getGamefield()[2] == 'X' && field.getGamefield()[5] == 'X' && field.getGamefield()[8] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.getGamefield()[0] == 'X' && field.getGamefield()[4] == 'X' && field.getGamefield()[8] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.getGamefield()[2] == 'X' && field.getGamefield()[4] == 'X' && field.getGamefield()[6] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.getGamefield()[0] == '0' && field.getGamefield()[1] == '0' && field.getGamefield()[2] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.getGamefield()[3] == '0' && field.getGamefield()[4] == '0' && field.getGamefield()[5] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.getGamefield()[6] == '0' && field.getGamefield()[7] == '0' && field.getGamefield()[8] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.getGamefield()[0] == '0' && field.getGamefield()[3] == '0' && field.getGamefield()[6] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.getGamefield()[1] == '0' && field.getGamefield()[4] == '0' && field.getGamefield()[7] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.getGamefield()[2] == '0' && field.getGamefield()[5] == '0' && field.getGamefield()[8] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.getGamefield()[0] == '0' && field.getGamefield()[4] == '0' && field.getGamefield()[8] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.getGamefield()[2] == '0' && field.getGamefield()[4] == '0' && field.getGamefield()[6] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.getGamefield()[0] != '1' && field.getGamefield()[1] != '2' && field.getGamefield()[2] != '3' &&
                field.getGamefield()[3] != '4' && field.getGamefield()[4] != '5' && field.getGamefield()[5] != '6' &&
                field.getGamefield()[6] != '7' && field.getGamefield()[7] != '8' && field.getGamefield()[8] != '9') {
            System.out.println("Draw!");
            return false;
        } else
            return true;
    }
}
