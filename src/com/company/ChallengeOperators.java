/*
1. double MealCost = the user input, this will be the original cost of the meal that the user enters.
In order to do this we need to do sc.nextDouble().
    System.out.println ("Enter you Meal Cost: ")
2. int TipRate = 0.15 * MealCost, this sets the tip rate at 15%.
3. int TaxRate = 0.07 * MealCost, this sets the tax rate at 15%.
4. int TotalCost = TipRate + TaxRate + MealCost.
5. System.out.println ("Tip: " + TipRate)
6. System.out.println ("Tax: " + TaxRate)
7. System.out.println ("Total " + TotalCost)


* */

package com.company;

import java.util.Scanner;

public class ChallengeOperators {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the cost of your meal: ");
        double mealinput = sc.nextDouble();
        System.out.println("Please enter the percent of your tip: ");
        int tipinput = sc.nextInt();
        System.out.println("Please enter the percent of your tax: ");
        int taxinput = sc.nextInt();

        solve (mealinput, tipinput, taxinput);

}
       public static void solve (double meal_cost,int tip_percent,int tax_percent){

            double Totalcost = ((tip_percent/100) * meal_cost)+((tax_percent/100) * meal_cost)+meal_cost;

            System.out.println("Total Cost: " + Math.round(Totalcost));

        }

    }

