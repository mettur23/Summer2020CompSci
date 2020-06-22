/*
Teja Mettu
June/19/2020
1. Println: Ask user how many words they want and what words
2. Create Scanner and name scanner sc
3. Create an Integer for the number of words
4.Create a String for the actual words
5. Create a do-while loop which enforces the word limit of the number of words and creates a range of valid numbers
6. Creates method titled Scramble
7.Prints the Final Answer in the main

Scramble method:
1. Create a string for even letters and for loop calling indexes that are even
2. Create a string for odd letters and for loop calling indexes that are odd
3. return the string variables by putting even letters space odd words
*/


package com.company;

import java.util.Scanner;

public class StringChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;
        String word;
            do{System.out.println("How many words do you want to process in between 1-10?");
            T = sc.nextInt();
            } while (T<1 || T>=10);
                for (int i = 1; i<= T; i++){
                    do{
                        System.out.println("What are the words you want to process?");
                        word = sc.next();
                    } while (word.length()<2 || word.length()>=10000);
                    String dividedWord = scramble(word);
                    System.out.println(dividedWord);
                }



    }

    public static String scramble (String userWord) {
        String evenWord = " ";
        String oddWord = " ";

        for (int even = 0; even < userWord.length(); even += 2) {
            char temp = userWord.charAt(even);
            evenWord = evenWord + temp;
        }
        for (int odd = 1; odd <userWord.length(); odd += 2) {
            char temp = userWord.charAt(odd);
            oddWord = oddWord + temp;
        }
String newWord = evenWord + " " + oddWord;
        return newWord;

    }

    }






