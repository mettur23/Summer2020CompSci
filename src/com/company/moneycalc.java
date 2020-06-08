package com.company;

public class moneycalc {

    public static void main(String[] args) {

        // Calculate total owed, assuming 8% tax / 15% tip

       int item1 = 38;
       int item2 = 40;
       int item3 = 30;

        System.out.println("Subtotal:");

        System.out.println(item1 + item2 + item3);

        System.out.println("Tax:");

        System.out.println((item1 + item2 + item3) * .08);

        System.out.println("Tip:");

        System.out.println((item1 + item2 + item3) * .15);

        System.out.println("Total:");

        System.out.println((item1 + item2 + item3)+

                (item1 + item2 + item3) * .15 +

                (item1 + item2 + item3) * .08);

    }

}
