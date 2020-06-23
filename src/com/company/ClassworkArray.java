/*
Teja Mettu
June 23/2020

1. Make a scanner for array input
2. Initialize 2 Ints for the array, set it equal to the Scanner
3. Import java.util.*
4. Make a string variable that is equal to the Scanner
5. Set a range for the Random Ints
6. Make a for loop that's equal to the length of the index
7. System.out.println(Array.tostring(int))

 */



package com.company;

import java.util.Arrays;
import java.util.Random;

public class ClassworkArray {

     public static void main (String[]args) {

         Random rand = new Random();
         int size = rand.nextInt(5) + 5;
         int[] numbers = new int[size];
         for (int i = 0; i < numbers.length; i++) {
             numbers[i] = rand.nextInt(100);
         }
         int index1;
         int index2;
         do {
             index1 = rand.nextInt(size);
             index2 = rand.nextInt(size);
         }
         while (index1 == index2);
         System.out.println(Arrays.toString(numbers));
         numbers = swap(numbers, index1, index2);
         System.out.println(Arrays.toString(numbers));
     }

        public static int[] swap( int[] numbers, int index1, int index2) {
            int temp = numbers[index1];
            numbers[index1] = numbers[index2];
            numbers[index2] = temp;

            return numbers;
        }


    }



