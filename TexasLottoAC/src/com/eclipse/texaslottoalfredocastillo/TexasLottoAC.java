package com.eclipse.texaslottoalfredocastillo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/// Programmer: Alfredo Castillo
/// Date: 10/9/2021
/// Description: This is a lotto guessing game. User can pick a number from 0 to 9.
/// Price depends on how many numbers are matched.

public class TexasLottoAC {
    public static void main(String args[]){

        // create instance of scanner class
        Scanner input = new Scanner(System.in);

        // create array for user input number selection
        int[] userNumbers = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Pick a number from 0 to 9: ");
            int guess = input.nextInt();
            userNumbers[i] = guess;
        }

        // create and instance of random class
        Random rnd = new Random();

        // create array of winning numbers
        int[] winNumbers = new int[6];

        for (int i = 0; i < 6; i++) {
            winNumbers[i] = rnd.nextInt(10);
        }

        // keep track of how many numbers are a matched
        int matched = 0;
        // loop through winning number array and increment numbers matched
        for (int e: winNumbers) {
            for (int n: userNumbers) {
                if (e == n){
                    matched++;
                }
            }
        }

        // concatenate random generated numbers
        String winningNumbers = Arrays.toString(winNumbers);
        // user picked numbers
        String inputNumbers = Arrays.toString(userNumbers);

        // display winning numbers
        System.out.println("Winning numbers are " + winningNumbers);
        System.out.println("Your picked numbers are " + inputNumbers);

        CheckWinnings(matched);
    }

    /// check for number of matched numbers
    public static void CheckWinnings(int x){
        // display price depending on how many numbers were matched
        if (x == 2){
            System.out.println("You matched Two Numbers. Try Again");
        }else if(x == 3){
            System.out.println("You matched Three Numbers. Price = $3.00");
        }else if(x == 4){
            System.out.println("You matched Four Numbers. Price = $49.00");
        }else if(x == 5){
            System.out.println("You matched Five Numbers. Price = $2,093.00");
        }else if(x == 6){
            System.out.println("You matched Six Numbers. Price = $5.5 Million");
        }else{
            System.out.println("Try Again!");
        }
    }
}
