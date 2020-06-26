package com.company;
import java.io.*;
import java.util.*;
public class FileTesting {

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("/Users/tejamettu/IdeaProjects/Summer2020_CompSci/src/com/company/weather.txt");
        Scanner input = new Scanner (file);
        int number =0;
        double temp1 = 0;
        boolean flag = false;
        if (input.hasNextDouble()) {
            temp1 = input.nextDouble();
        }
        double temp2 = 0;
        while (input.hasNextLine()){
            if (input.hasNextDouble()){
                temp2= input.nextDouble();
                flag = true;
            }
            else{
                String trash = input.next();
                flag = false;
            }
            System.out.printf("the difference %5.2f   %5.2f  is %5.2f  \n", + temp1,temp2, + (temp1-temp2));
            temp1 = temp2;
        }

    }


}
