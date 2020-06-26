/*
Teja Mettu
June 19, 2020
1. Import java.util.Random
2. Turn int n into a Random Number
3. make an if statement that finds whether the int n is divisble by two without remainder
4. if it is divisible without a remainder then println "Not weird"
5. make an else statement if it has a remainder print weird
6. If even and in the range 2 to 5 print Not Weird
7. If even and in the range of 6 to 20 print Weird
8. If even and not in between the 2 ranges check if greater than 20, if so then print Not Weird




UPDATE (June 19th: After hours of work I can't manage to get the program to run properly,
 the solve method isn't returning the if statements properly and
 the Loop I setup in the main isn't getting stuck on solve and not hitting line 51)
  */

package com.company;
import java.util.Random;
import java.util.Scanner;


public class ConditionalStatement {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); //asks whether user wants to play
        System.out.println("Do you want to play? Enter yes or no:");
        String YesOrNo = sc.nextLine();
        int loop = 0;

        if (YesOrNo.equals("yes")) {
            loop = 1;
        }
        if (YesOrNo.equals("no")) { // subtracts 1 to loop if they don't want to play
            loop = 0;
            System.out.println("Okay thanks for playing");
        }

        while (loop == 1) { // loop MUST be greater than or equal to 1 in order to run

            Random rand = new Random();
            int max = 137; //setting maximum value at 137
            int n = rand.nextInt(max);
            n += 1; //setting range of values between 1-137
            solve(n); // runs the method

            loop = 0;

            System.out.println("Do you want to play again? Enter yes or no:");
            YesOrNo = sc.next();

            if (YesOrNo.equals("yes")) { // if user wants to play it adds 1 to loop
                loop=1;

            }
            else { // subtracts 1 to loop if they don't want to play

                loop = 0;

                System.out.println("Thanks for playing!");
            }
        }

    }






    public static void solve (int n){



                if (n % 2 > 0){
                    System.out.println("Weird");
                }

                if (n % 2 == 0) {

                    }
                    else if  (n>=2||n<=5){
                        System.out.println("Not Weird");
                    }
                        else if (n>6||n<20){
                             System.out.println("Weird");

                             }
                                 else if (n>20){

                                     System.out.println("Not Weird");

                                 }

                                 n = 0;
            }




    }