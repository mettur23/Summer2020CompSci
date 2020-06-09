package com.company;

public class Letters {

    public static int SIZE = 10;
    public static void main(String[] args) {

        char letter = 65;

        for (int i = SIZE; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j) + " ");
            }
            System.out.println();
        }


            for (int i = 0; i <= SIZE; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print((char) (letter + j) + " ");
                }
                System.out.println();
            }
    }
}