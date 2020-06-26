/*
Teja Mettu

1. import java.util.*
import.java.io.*
2. Create main and number and letter method
3. Create a scanner in the main class
4. Ask the user to guess a number or a word
5. In the main method create if statement: If the user chooses word then run the Letter Method,
                                           If the user chooses number then run the number method.
6. IN the number and letter methods create a int points = 0.
7. Make random strings in both classes
8. In the main create a while loop that allows users to play again through an If statement
If user says yes run loop, If user says No System.out.println("Thanks for playing")
9. Create txt. file in the same folder, and list your options within that file for Numbers
10.  Create txt. file in the same folder, and list your options within that file for Words
*/
package com.company;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;



public class Final_Project {
    public static int FinalScore;
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to the play the game? Enter yes or no:");
        String YesOrNo = sc.nextLine();
        int repeated = 0;

        while (YesOrNo.equals("yes")) {

            System.out.println("Do you want to play the basketball words guessing game or even numbers guessing game? Enter words or numbers to choose: ");
            String WordsOrNum = sc.nextLine();

            if (WordsOrNum.equals("words")) {

                Words();
            }
            if (WordsOrNum.equals("numbers")) {
                Numbers();

            }
            System.out.println("Would you like to the play again? Enter yes or no:");
            YesOrNo = sc.nextLine();

            repeated ++;
        }
        if (YesOrNo.equals("no")){
            System.out.println("Thanks for playing. FINAL SCORE: " + FinalScore);
            System.out.println("Number of Attempts:" + repeated );
        }
    }





    public static void Words () throws FileNotFoundException {

        System.out.println("You have chosen the words game! Guess any random word that's in the wordbank");
        System.out.println("WordBank:\n" + "basketball\n" + "court\n" + "jersey\n" + "jordan\n" + "whistle\n" + "referee" + "\n");

        Random rand = new Random();
        int max = 5;
        int n = rand.nextInt(max);



        String temp1 = null;
        try {
            temp1 = Files.readAllLines(Paths.get("/Users/tejamettu/IdeaProjects/Summer2020_CompSci/src/com/company/Wordgame.txt")).get(n);

        } catch (IOException e) {
            System.out.println(e);
        }

        Scanner sc = new Scanner(System.in);
        String wordinput = sc.nextLine();

        if (wordinput.equals(temp1)) {
            System.out.println("CONGRATS YOU HAVE GUESSED CORRECTLY. ADDED 1 POINT");
            FinalScore++;
        } else {
            System.out.println("YOU HAVE FAILED. NO POINTS ADDED :(");
        }
    }






    public static void Numbers () throws FileNotFoundException {

        System.out.println("You have chosen the numbers game! Guess any random even number between 0-10");

        Random rand = new Random();
        int max = 5;
        int n = rand.nextInt(max);



        String temp2 = null;
        try {
            temp2 = Files.readAllLines(Paths.get("/Users/tejamettu/IdeaProjects/Summer2020_CompSci/src/com/company/Numbergame.txt")).get(n);

        } catch (IOException e) {
            System.out.println(e);
        }

        Scanner sc = new Scanner(System.in);
        String numberinput = sc.nextLine();

        if (numberinput.equals(temp2)) {
            System.out.println("CONGRATS YOU HAVE GUESSED CORRECTLY. ADDED 1 POINT");
            FinalScore++;
        } else {
            System.out.println("YOU HAVE FAILED. NO POINTS ADDED :(");
        }

    }
}

