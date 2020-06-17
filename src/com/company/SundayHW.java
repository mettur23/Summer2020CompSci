package com.company;

public class SundayHW {

    public static int Size = 4;

    public static void main(String[] args) {

        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();

    }

    public static void Top() {
        for (int line = 1; line <= Size; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= -1 * line + Size; spaces++) {
                System.out.print(" ");
            }

            for (int dots = 1; dots <= line - 1; dots++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int dots = 1; dots <= line - 1; dots++) {
                System.out.print("\\");
            }

            for (int spaces = 1; spaces <= -1 * line + Size; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Line() {
        System.out.print("+");
        for (int dash = 0; dash <= -2 + Size * 2; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void Bottom() {
        for (int line = 1; line <= Size; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= 2.5 * line - Size; spaces++) {
                System.out.print(" ");
            }

            for (int dots = 1; dots <= Size - 1*line; dots++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int dots = 1; dots <= Size - 1*line; dots++) {
                System.out.print("/");
            }

            for (int spaces = 1; spaces <= 2.5 * line - Size; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}