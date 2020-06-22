package com.company;
import java.util.Random;
import java.util.Scanner;

public class TempratureCalc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int days = 0;
        do {
            System.out.println("How many days would you like to process?");
            days = input.nextInt();
        } while (days > 100 || days < 2);

        int[] myArray = new int[10];
        Random randy = new Random();
        double average = 0.0;
        int count = 0;

        for (int i = 0; i <= days; i++) {
            myArray[i] = randy.nextInt(85) + 25;
            System.out.println("This is temp: " + myArray[i]);
            average = average + myArray[i];

        }
        average = average / days;
        System.out.println("average" + average);

        for (int i = 0; i < days; i++) {
            if (myArray[days] > average) {
                count++;

            }
        }
        System.out.println(count + "days are above the average temperature");
    }
}



