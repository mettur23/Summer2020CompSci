package com.company;
import java.util.Scanner;
public class ArrayStringChallenge {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many times would you like to run the program");
        int N = in.nextInt();
        in.nextLine();
        for (int i = 0; i < N; i++)
        {
            System.out.println("Enter your phrase:");
            String string = in.nextLine();
            char[] charArray = string.toCharArray();
            for (int j = 0; j < charArray.length; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(charArray[j]);
                }
            }
            System.out.print(" ");
            for (int j = 0; j < charArray.length; j++)
            {
                if (j % 2 != 0)
                {
                    System.out.print(charArray[j]);
                }
            }
            System.out.println();
        }
        in.close();
    }
}

