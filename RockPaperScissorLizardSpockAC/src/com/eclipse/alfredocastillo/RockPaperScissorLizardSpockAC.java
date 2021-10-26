package com.eclipse.alfredocastillo;

import java.util.Random;
import java.util.Scanner;

/// Programmer: Alfredo Castillo
/// Date: 10/2/2021
/// Description: This is a simple Rock Paper Scissor Lizard Spock Game.

public class RockPaperScissorLizardSpockAC {
    public static void main(String args[]){

        // display game title
        System.out.println("Scissor Rock Paper Lizard Spock Game");

        // take user input
        Scanner userInput = new Scanner((System.in));
        System.out.println("Enter a number from 0 to 4:");
        System.out.println("(0 for Scissor , 1 for Rock , 2 for Paper , 3 for Lizard , 4 for Spock)");
        int user = userInput.nextInt();

        // create an instance of Random class
        Random rand = new Random();
        // generate random int in range 0 to 5
        int comGuess = rand.nextInt(5);

        // get assign name for int. ex 0 = scissors, 1 = rock
        String userInputName = numberLabel(user);
        String computerGuessName = numberLabel(comGuess);

        // display the user input
        System.out.println("Player Chooses: " + user + " - "+ userInputName);
        System.out.println("Computer Chooses: " + comGuess + " - " + computerGuessName);

        // determine if a win, loss, or tie. method take in user input and computer guess.
        runGame(user, comGuess);

    }

    /// return the assign name for a given number in range 0 to 5
    static String numberLabel(int x){
        switch (x){
            case 0:
                return "Scissor";
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Lizard";
            case 4:
                return "Spock";
            default:
                return "Invalid";
        }
    }

    /// method takes in the user input and computer input to check for a win, loss, or tie
    static void runGame(int userInput, int comInput){
        // switch on user input
        switch (userInput){
            case 0:
                if (comInput == 2 || comInput == 3){
                    System.out.println("You win!");
                }else if (comInput == userInput){
                    System.out.println("It's a Tie!");
                }else{
                    System.out.println("You loose!");
                }
                break;
            case 1:
                if (comInput == 0 || comInput == 3){
                    System.out.println("You win!");
                }else if (comInput == userInput){
                    System.out.println("It's a Tie!");
                }else{
                    System.out.println("You loose!");
                }
                break;
            case 2:
                if (comInput == 1 || comInput == 4){
                    System.out.println("You win!");
                }else if (comInput == userInput){
                    System.out.println("It's a Tie!");
                }
                else{
                    System.out.println("You loose!");
                }
                break;
            case 3:
                if (comInput != 2 || comInput != 4){
                    System.out.println("You win!");
                }else if (comInput == userInput){
                    System.out.println("It's a Tie!");
                }
                else{
                    System.out.println("You loose!");
                }
                break;
            case 4:
                if (comInput != 0 || comInput != 4){
                    System.out.println("You win!");
                }else if (comInput == userInput){
                    System.out.println("It's a Tie!");
                }
                else{
                    System.out.println("You loose!");
                }
                break;
            default:
                System.out.println("Invalid!");
                break;
        }
    }
}
