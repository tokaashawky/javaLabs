package com.mycompany.accept_arr_input;
import java.util.Scanner;
public class Accept_arr_input {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //get size and create array
        System.out.println("enter size of array: ");
        int size=input.nextInt();
        // declare array
        double [] numArray=new double[size];
        //get the values of array from user
        for(int i=0;i<numArray.length;i++)
        {
          System.out.println("value "+(i+1));  
          numArray[i]=input.nextInt();
        }
        //variable use to compare each val of arr with it
        double largest;
        //initial it with first val of array
        largest=numArray[0];
        for (double num: numArray)
        {
           if(largest < num)
               largest = num;
        }
        System.out.printf("Largest value= %f", largest);
    }
}
