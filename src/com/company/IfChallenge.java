package com.company;

import java.util.Scanner;

public class IfChallenge {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Put in your height in inches for BMI1: ");
        double h = sc.nextDouble();

        sc = new Scanner(System.in);
        System.out.println("Put in your weight in pounds BMI1: ");
        double w = sc.nextDouble();

        sc = new Scanner(System.in);
        System.out.println("Put in another height in inches BMI2: ");
        double h2 = sc.nextDouble();

        sc = new Scanner(System.in);
        System.out.println("Put in another weight in pounds BMI2: ");
        double w2 = sc.nextDouble();

        double BMI = w / (h * h) * 703;
        double BMI2 = w2 / (h2 * h2) * 703;
        double difference = BMI - BMI2;
        System.out.println("BMI1 = " + BMI);
        System.out.println("BMI2 = " + BMI2);
        System.out.println("The difference in BMI: " + difference);

        if (BMI >= 30.0) {
            System.out.println("BMI1 OBESE");
        } else if (BMI < 18.5) {
            System.out.println("BMI1 UNDERWEIGHT");}

        if (BMI2 >= 30.0) {
            System.out.println("BMI2 OBESE");
        } else if (BMI2 < 18.5) {
            System.out.println("BMI2 UNDERWEIGHT");}


    }
}





