/*
Teja Mettu
June/19/2020
1. Initialize String S and Int N
2. Create scanner input for String S
3. identify String S indexes
4. Set Integer T as the amount of Words in the String
1<=T<=10
2<=length of S<= 10000
5. Main return method we used in the solve void
6. Make a substring for the indexes
Make variable for the substrings divided by 2. Out space after the return of the value of the index.

NOTE: I worked with Megan on this code, and I found a new strategy, so I didn't follow my initial pseudocode.
*/


package com.company;

import java.util.Scanner;

public class StringChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String userWord = sc.nextLine();
        String newWord = scramble(userWord);
        System.out.println(newWord);

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






