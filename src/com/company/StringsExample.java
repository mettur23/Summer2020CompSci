package com.company;

public class StringsExample {



public static void main(String[] args) {

    sayHi("Marty");

    String teacher = "Teja Mettu";
    sayHi(teacher);
    SundayHW.Line();
}
 public static void sayHi(String name) {
    System.out.println("This name is" + name.length()+" characters long");
    System.out.println("Hello "+ name);
 }

}
