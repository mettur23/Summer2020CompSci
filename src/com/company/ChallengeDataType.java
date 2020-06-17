/*
Teja Mettu
June 16, 2020.
Declare a string, int, and double.
String a = "Greenhill"
int b
double c
Use Scanner to read 3 lines of input and initialize
3. Use println to print the sums of variables; sum of plus your int variable, sum of plus your double variable,


*/

package com.company;
import java.util.Scanner;
public class ChallengeDataType {


    public static void main (String [] args ){

        int i = 4;
        double d = 4.0;
        String s = "Greehill ";

            Scanner sc = new Scanner(System.in);
        System.out.println("Put in a word: ");
        String c = sc.nextLine();
            System.out.println("Put in an integer");
            int a = sc.nextInt();
        System.out.println("Put in a decimal");
            Double b = sc.nextDouble();


            int totalint = i + a;
            Double totaldouble = d + b;
            String totalstring = s + c;

            System.out.println("Sum of integers:" + totalint);
            System.out.println("Sum of decimals: " + totaldouble);
            System.out.println("Your phrase is: " + totalstring);

        }

    }


