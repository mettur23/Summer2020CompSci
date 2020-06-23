package com.company;
import java.util.*;
public class ArrayClass {

    public static void main(String[] args) {

        Random rand = new Random();
        int [] numbers = {2,5,8,34,14,79,32};
        int [] num2 = new int [numbers.length];
        for (int i = 0; i<numbers.length; i++){
            num2 [i] = rand.nextInt(95)+5;
        }
        System.out.println(Arrays.toString(numbers));
        numbers= reverse(numbers);
        System.out.println(Arrays.toString(num2));
        num2 = reverse(num2);
      //  System.out.println(Arrays.toString(numbers));
    }


    public static int[] reverse(int[] rev){
for(int i=0; i<rev.length/2; i++){
    int temp = rev[i];
    rev[i] = rev[rev.length - 1-i];
    rev[rev.length-1-i]=temp;
}
        return rev;
    }

}
