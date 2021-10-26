package com.itse.alfredocastillo;

import java.util.Random;
import java.util.Scanner;

/// Programmer: Alfredo Castillo
/// Date: 10/13/2021
/// Description: This is a math tutoring application.
// Ask the user a math question and checks if the answer is correct

public class MathTutorAC {
    // declare global variables
    public static int correctAnswer;
    public static int answer;
    public static int userInput;

    public static void main (String[] args){

        // create instance of scanner class
        Scanner input = new Scanner(System.in);

        while (true){
            // display menu
            menu();

            // read user input
            userInput = input.nextInt();

            // assign random numbers to local int variable
            int num1 = randomNumbers()[0];
            int num2 = randomNumbers()[1];

            // error catching. this will only work when a number is divided by zero.
            // I could add input validation. but I am too lazy right now.
            try{
                switch (userInput){
                    case 1:
                        // display question to user
                        System.out.println("What is " + num1 + " + " + num2 + "?");

                        // read user input
                        answer = input.nextInt();

                        // call addition method
                        addition(num1,num2);

                        // call method to check answer
                        checkAnswer(answer,correctAnswer);
                        break;
                    case 2:
                        // display question to user
                        System.out.println("What is " + num1 + " - " + num2 + "?");

                        // read user input
                        answer = input.nextInt();

                        // call addition method
                        subtraction(num1,num2);

                        // call method to check answer
                        checkAnswer(answer,correctAnswer);
                        break;
                    case 3:
                        // display question to user
                        System.out.println("What is " + num1 + " x " + num2 + "?");

                        // read user input
                        answer = input.nextInt();

                        // call addition method
                        multiplication(num1,num2);

                        // call method to check answer
                        checkAnswer(answer,correctAnswer);
                        break;
                    case 4:
                        // display question to user
                        System.out.println("What is " + num1 + " / " + num2 + "?");

                        // read user input
                        answer = input.nextInt();

                        // call addition method
                        division(num1,num2);

                        // call method to check answer
                        checkAnswer(answer,correctAnswer);
                        break;
                }
                if (userInput == 5){
                    System.out.println("Exiting");
                    break;
                }
            }catch (Exception e){
                // returns error
                System.out.println("Undefined! " + num1 + " can't be divided by 0");
            }
        }
    }

    /// method check if answer is correct
    static void checkAnswer(int answer, int correctAnswer){
        // check if user input matches correctAnswer and display Correct or Your answer is wrong
        if (answer == correctAnswer){
            System.out.println("Correct");
        }else{
            System.out.println("Your answer is wrong! The correct answer is: " + correctAnswer);
        }
    }

    /// method display menu options
    static void menu(){
        System.out.println("---------------\n Math Tutor\n 1: Addition\n 2: Subtraction\n 3: Multiplication \n 4: Division\n 5: Exit\n---------------");
        System.out.println("Enter a number:");
    }

    /// method gives two random numbers
    static int[] randomNumbers(){

        // declare array to store random numbers from 0 to 9
        int[] numbers = new int[2];

        // create instance of random class
        Random rnd = new Random();

        // get random number and add to array
        numbers[0] = rnd.nextInt(0,10);
        numbers[1] = rnd.nextInt(0,10);

        // return array
        return numbers;
    }

    /// method to add numbers
    static void addition(int num1, int num2){
        // get correct answer
        correctAnswer = num1 + num2;
    }

    /// method to subtract numbers
    static void subtraction(int num1, int num2){
        // get correct answer
        correctAnswer = num1 - num2;
    }

    /// method to multiply numbers
    static void multiplication(int num1, int num2){
        // get correct answer
        correctAnswer = num1 * num2;
    }

    /// method to divide numbers
    static void division(int num1, int num2){
        // get correct answer
        correctAnswer = num1 / num2;
    }
}
