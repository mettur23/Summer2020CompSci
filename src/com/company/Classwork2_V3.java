package com.company;

public class Classwork2_V3 {

    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();

    }

    public static void Top() {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= -2 * line + 8; spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - 4; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= -2 * line + 8; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
        public static void Line () {
            System.out.print("#");
            for (int dash = 0; dash < 16; dash = dash + 1) {
                System.out.print("=");
            }
            System.out.println("#");
        }


        public static void Bottom () {
            for (int line = 1; line < 5; line++) {
                System.out.print("|");
                for (int spaces = 1; spaces <= 2 * line -2; spaces++) {
                    System.out.print(" ");
                }
                System.out.print("<>");
                for (int dots = 1; dots <= -4 * line + 16; dots++) {
                    System.out.print(".");
                }
                System.out.print("<>");
                for (int spaces = 1; spaces <= 2 * line -2; spaces++) {
                    System.out.print(" ");
                }
                System.out.println("|");


        }
    }
}




