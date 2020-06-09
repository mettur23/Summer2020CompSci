package com.company;

public class moneycalc {

  public static int item1 = 38;
  public static int item2 = 40;
  public static int item3 = 30;

    public static void main(String[] args) {

        // Calculate total owed, assuming 8% tax / 15% tip

        Subtotal();
    Tax();
      Tips();
      Total();
    }



    public static void Subtotal () {
        System.out.println("Subtotal:");

        System.out.println(item1 + item2 + item3);
    }
    public static void Tax () {
        System.out.println("Tax:");

        System.out.println((item1 + item2 + item3) * .08);
    }

     public static void Tips ()  {
            System.out.println("Tip:");

            System.out.println((item1 + item2 + item3) * .15);
        }

        public static void Total (){

        System.out.println("Total:");

        System.out.println((item1 + item2 + item3)+

                (item1 + item2 + item3) * .15 +

                (item1 + item2 + item3) * .08);

    }

}
