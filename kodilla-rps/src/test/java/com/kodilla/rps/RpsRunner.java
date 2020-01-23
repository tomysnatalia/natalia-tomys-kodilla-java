package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        int Rock = 1;
        int Paper = 2;
        int Scissors = 3;
        int player;
        int computer;
        int playerPoints = 0;
        int computerPoints = 0;
        boolean end = false;


        System.out.println(" **** Hello let's start to play in Rock, Paper, Scissors ****\n");
        System.out.println("ROCK = 1, PAPER = 2, SCISSORS = 3");
        System.out.println();


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = scan.nextLine();
        System.out.println("*** Hello " + userName + " *** to how many wins you want to play? ");
        int counter = scan.nextInt();
        System.out.println("Okey up to " + counter + " wins");
        System.out.println("Start!! your move");


        Random random = new Random();


        while (playerPoints < counter || computerPoints < counter) {
            player = scan.nextInt();
            computer = random.nextInt(3);
            if (player == 1 && computer == 3) {
                System.out.println(userName + " choose Rock ");
                System.out.println("Computer choose Scissors\n" + userName + " won!!");
                playerPoints++;

            } else if (player == 1 && computer == 2) {
                System.out.println(userName + " choose Rock ");
                System.out.println("Computer choose Paper\n Computer Won!!");
                computerPoints++;

            } else if (player == 1 && computer == 1) {
                System.out.println(userName + " choose Rock ");
                System.out.println("Computer choose Rock \n Game Tie!!");

            } else if (player == 2 && computer == 2) {
                System.out.println(userName + " choose Paper");
                System.out.println("Computer choose Paper \n Game Tie!!");

            } else if (player == 2 && computer == 1) {
                System.out.println(userName + " choose Paper");
                System.out.println("Computer choose Rock \n" + userName + " won!!");
                playerPoints++;

            } else if (player == 2 && computer == 3) {
                System.out.println(userName + " choose Paper");
                System.out.println("Computer choose Scissors \n Computer won!!");
                computerPoints++;

            } else if (player == 3 && computer == 3) {
                System.out.println(userName + " choose Scissors");
                System.out.println("Computer choose Scissors \n Game tie!!");

            } else if (player == 3 && computer == 2) {
                System.out.println(userName + " choose Scissors");
                System.out.println("Computer choose Paper\n" + userName + " won!!");
                playerPoints++;

            } else if (player == 3 && computer == 1) {
                System.out.println(userName + " choose Scissors");
                System.out.println("Computer choose Rock \n Computer won!!");
                computerPoints++;

            } else {
                System.out.println("Something goes wrong \n try again");
            }
        }
    }
}

