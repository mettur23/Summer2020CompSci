package com.company;

public class GangstaName {

    public static void main(String[] args) {


        String FullName = "Marge Simpson";
        initials1(FullName);
        System.out.print("Diddy ");
        printlastname(FullName);
        System.out.print(" ");
        printfirstname(FullName);
        System.out.print("-izzle");

    }
    public static void initials1(String name){

            char FirstIn = name.charAt(0);
            System.out.print((FirstIn)+".");


        }
    public static void printlastname(String name) {
        char q;

        for (int i = 6; i <= 12; i++) {
            char h = (name.charAt(i));
            q = Character.toUpperCase(h);
            System.out.print(q);
        }
    }
    public static void printfirstname(String name){
        char q;
        for (int i = 0; i <= 5; i++){
            char h = (name.charAt(i));
            System.out.print(h);
        }

    }
    }



