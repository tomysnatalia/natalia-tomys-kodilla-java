package com.kodilla.rps;


import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        int player;
        int computer;
        int playerPoints = 0;
        int computerPoints = 0;
        String finish ;
        int b;
        b = 1;
        boolean end = false;

        do {
            System.out.println(" **** Hello let's start to play in Rock, Paper, Scissors ****");
            System.out.println("ROCK = 0, PAPER = 1, SCISSORS = 2");
            System.out.println();

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String userName = scan.nextLine();
            System.out.println("      *** Hello " + userName + " ***\nTo how many wins you want to play? ");
            int counter = scan.nextInt();
            System.out.println("Okey up to " + counter + " wins");
            System.out.println("Start!! It's your move");

            Random random = new Random();
            if (playerPoints < counter || computerPoints < counter) {
                player = scan.nextInt();
                computer = random.nextInt(2);

                if (player == 0 && computer == 2) {
                    System.out.println(userName + " choose Rock ");
                    System.out.println("Computer choose Scissors\n" + userName + " won!!");
                    playerPoints++;

                } else if (player == 0 && computer == 1) {
                    System.out.println(userName + " choose Rock ");
                    System.out.println("Computer choose Paper\n Computer Won!!");
                    computerPoints++;

                } else if (player == 0 && computer == 0) {
                    System.out.println(userName + " choose Rock ");
                    System.out.println("Computer choose Rock \n Game Tie!!");

                } else if (player == 1 && computer == 1) {
                    System.out.println(userName + " choose Paper");
                    System.out.println("Computer choose Paper \n Game Tie!!");

                } else if (player == 1 && computer == 0) {
                    System.out.println(userName + " choose Paper");
                    System.out.println("Computer choose Rock \n" + userName + " won!!");
                    playerPoints++;

                } else if (player == 1 && computer == 2) {
                    System.out.println(userName + " choose Paper");
                    System.out.println("Computer choose Scissors \n Computer won!!");
                    computerPoints++;

                } else if (player == 2 && computer == 2) {
                    System.out.println(userName + " choose Scissors");
                    System.out.println("Computer choose Scissors \n Game tie!!");

                } else if (player == 2 && computer == 1) {
                    System.out.println(userName + " choose Scissors");
                    System.out.println("Computer choose Paper\n" + userName + " won!!");
                    playerPoints++;

                } else if (player == 2 && computer == 0) {
                    System.out.println(userName + " choose Scissors");
                    System.out.println("Computer choose Rock \n Computer won!!");
                    computerPoints++;

                }

                if (computerPoints == counter) {
                    System.out.println("Computer won!! - TRY AGAIN");
                    System.out.println("Computer points: " + computerPoints + " Player points: " + playerPoints);
                    System.out.println("Do you want play again?");
                    System.out.println("8 = NO");
                    System.out.println("9 = YES");
                    finish = scan.nextLine();


                } else if (playerPoints == counter) {
                    System.out.println("CONGRATULATIONS **** " + userName + " **** YOU ARE THE WINNER!");
                    System.out.println("Computer points: " + computerPoints + " Player points: " + playerPoints);
                    System.out.println("Do you want play again?");
                    System.out.println("8 = NO");
                    System.out.println("9 = YES");
                    finish = scan.nextLine();

                }
                finish = scan.nextLine();

                if (finish.equals("8")) {
                    end = true;
                } else if (finish.equals("9")) {
                    System.out.println("Let's play again Rock,Paper,Scissors!");
                }
            }
        }
        while (!end) ;
        System.out.println("THE END");
    }
}