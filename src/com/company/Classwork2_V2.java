package com.company;

/* Rocket Challenge!!!!!*/

public class Classwork2_V2 {

    public static void main(String[] args) {
Line();
Top();
Bottom();
Line();


    }

    public static void Top () {
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");
    }
    public static void Line () {

        System.out.print("#");
        for( int dash=0; dash <16 ; dash = dash + 1){
            System.out.print("=");
        }
        System.out.println("#");
    }
    public static void Bottom () {
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");

        }

    }

