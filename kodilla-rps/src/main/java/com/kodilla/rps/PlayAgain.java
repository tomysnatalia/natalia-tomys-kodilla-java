package com.kodilla.rps;

import java.util.Scanner;

public class PlayAgain {
    public void playAgain() {
        Scanner playAgain = new Scanner(System.in);
        int b;
        b = 1;

        System.out.println("Do you want play again?");
        System.out.println("8 = NO");
        System.out.println("9 = YES");
        int yes = 9;
        int no = 8;
        int input;
        input = playAgain.nextInt();

        if (input == 9) {
            System.out.println("Let's play again Rock,Paper,Scissors!");
        } else if (input == 8) {
            System.out.println("Thank for playing. See you next time :)!");
            System.out.println("The End");
        }
    }
}

