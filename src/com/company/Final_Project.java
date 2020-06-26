/*
Teja Mettu
June 25, 2020
import java.io
import the java.io file
import the java.io file path
import scanner wrap java.util.Arrays
import scanner wrap java.util.Random
import java scanner
Declare public static integer FinalScore
Declare scanner
For each method, add a scanner for the return value
Ask the user if they want to play the game yes or no
Create string YesOrNo that equals the next line
Create integer repeated that equals zero
While
-YesOrNo equals yes then ask user if they want to play sports words guessing game or even numbers game
- Make String WordsOrNum that equals the next line
- if statement = WordsOrNum equals words, then transfer program to the public static Words()
- if WordsOrNum equals numbers then transfer program to the public static
Ask user if they want to play again by answering yes or no
YesOrNo equals the next line
Make repeated++
If
- YesOrNo equals no, then print that the game has ended and print the final score
- Print the number of attempts with repeated
Make a public static void Words(String wordinput)  throws FileNotFoundException
Create a file called file that has a pathname correspondent to the file text program with 20 tokens in 20 lines
Create integer n that equals 0
Make a new scanner called Scanner that corresponds with file
While
-while scanner has the next line, the String nextToken is equal to the next scanner
- if statement = nextToken equals the word of the user input, then tell the user congrats they have guessed the right word and get one point.
Final score advancing by ++
Do the same class as numbers, but change the file to a different text file.
 */

package com.company;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class Final_Project {
    public static int FinalScore;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("" +
                "█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\n" +
                "█░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█\n" +
                "█░░║║║╠─║─║─║║║║║╠─░░█\n" +
                "█░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█\n" +
                "█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█\n" +
                "\n" +
                "████████╗ ███████╗ ░░░░░██╗ ░█████╗░  ░█████╗░███╗░░██╗██████╗░  ██╗░░░░░██╗░█████╗░███╗░░██╗\n" +
                "╚══██╔══╝ ██╔════╝ ░░░░░██║ ██╔══██╗  ██╔══██╗████╗░██║██╔══██╗  ██║░░░░░██║██╔══██╗████╗░██║\n" +
                "░░░██║░░░ █████╗   ░░░░░██║ ███████║  ███████║██╔██╗██║██║░░██║  ██║░░░░░██║███████║██╔██╗██║\n" +
                "░░░██║░░░ ██╔══╝   ██╗░░██║ ██╔══██║  ██╔══██║██║╚████║██║░░██║  ██║░░░░░██║██╔══██║██║╚████║\n" +
                "░░░██║░░░ ███████╗ ╚█████╔╝ ██║░░██║  ██║░░██║██║░╚███║██████╔╝  ███████╗██║██║░░██║██║░╚███║\n" +
                "░░░╚═╝░░░ ╚══════╝ ░╚════╝░ ╚═╝░░╚═╝  ╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░  ╚══════╝╚═╝╚═╝░░╚═╝╚═╝░░╚══╝");
        //https://www.messletters.com/en/text-art/

        System.out.println("Would you like to play? Enter yes or no:");
        String YesOrNo = sc.nextLine();
        int repeated = 0;

        while (YesOrNo.equalsIgnoreCase("yes")) {

            System.out.println("Do you want to play the sports words guessing game or even numbers guessing game? Enter words or numbers to choose: ");
            String WordsOrNum = sc.nextLine();

            if (WordsOrNum.equalsIgnoreCase("words")) {

                System.out.println("You have chosen the words game! Guess any word that's related to sports");
                String Realwordinput = sc.nextLine();
                Words(Realwordinput);
            }
            if (WordsOrNum.equalsIgnoreCase("numbers")) {
                System.out.println("You have chosen the numbers game! Guess any random even number");
                String Realnumberinput = sc.nextLine();
                Numbers(Realnumberinput);

            }
            System.out.println("Would you like to try again? Enter yes or no:");
            YesOrNo = sc.nextLine();

            repeated++;
        }
        if (YesOrNo.equalsIgnoreCase("no")) {
            System.out.println("The game has ended. FINAL SCORE: " + FinalScore);
            System.out.println("Number of Attempts:" + repeated);
        }
    }


    public static void Words(String wordinput) throws FileNotFoundException {


        File file = new File("/Users/tejamettu/IdeaProjects/Summer2020_CompSci/src/com/company/Wordgame.txt");
        int n = 0;

        Scanner scanner = new Scanner(file);


        while (scanner.hasNextLine()) {
            String nextToken = scanner.next();
            if (nextToken.equals(wordinput)) {
                System.out.println("\n" +
                        "░██╗░░░░░░░██╗ ██╗ ███╗░░██╗ ███╗░░██╗ ███████╗ ██████╗░\n" +
                        "░██║░░██╗░░██║ ██║ ████╗░██║ ████╗░██║ ██╔════╝ ██╔══██╗\n" +
                        "░╚██╗████╗██╔╝ ██║ ██╔██╗██║ ██╔██╗██║ █████╗░░ ██████╔╝\n" +
                        "░░████╔═████║░ ██║ ██║╚████║ ██║╚████║ ██╔══╝░░ ██╔══██╗\n" +
                        "░░╚██╔╝░╚██╔╝░ ██║ ██║░╚███║ ██║░╚███║ ███████╗ ██║░░██║\n" +
                        "░░░╚═╝░░░╚═╝░░ ╚═╝ ╚═╝░░╚══╝ ╚═╝░░╚══╝ ╚══════╝ ╚═╝░░╚═╝");
                //https://fsymbols.com/generators/tarty/
                FinalScore++;
            }

        }

    }

    public static String nextToken;

    public static void Numbers(String numberinput) throws FileNotFoundException {


        File file = new File("/Users/tejamettu/IdeaProjects/Summer2020_CompSci/src/com/company/Numbergame.txt");
        int n = 0;

        Scanner scanner = new Scanner(file);


        while (scanner.hasNextLine()) {
            nextToken = scanner.next();
            if (nextToken.equals(numberinput)) {
                System.out.println("\n" +
                        "░██╗░░░░░░░██╗ ██╗ ███╗░░██╗ ███╗░░██╗ ███████╗ ██████╗░\n" +
                        "░██║░░██╗░░██║ ██║ ████╗░██║ ████╗░██║ ██╔════╝ ██╔══██╗\n" +
                        "░╚██╗████╗██╔╝ ██║ ██╔██╗██║ ██╔██╗██║ █████╗░░ ██████╔╝\n" +
                        "░░████╔═████║░ ██║ ██║╚████║ ██║╚████║ ██╔══╝░░ ██╔══██╗\n" +
                        "░░╚██╔╝░╚██╔╝░ ██║ ██║░╚███║ ██║░╚███║ ███████╗ ██║░░██║\n" +
                        "░░░╚═╝░░░╚═╝░░ ╚═╝ ╚═╝░░╚══╝ ╚═╝░░╚══╝ ╚══════╝ ╚═╝░░╚═╝");
                //https://fsymbols.com/generators/tarty/
                FinalScore++;


            }


        }
    }
}



