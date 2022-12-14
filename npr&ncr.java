package com.mycompany.lab_1;
import java.util.Scanner;
public class lab_1
{ //fun to cal the fact for n! and (n-r)! and r!
   public static int fact(int num)
   { //make initial value at 1
      int fact=1;
      for(int i=1; i<=num; i++)
         //if num=5
          // fact=1-->1*1+1*2+2*3+6*4+24*5=120
         fact *= i;
      return fact;
   }
 public static void main(String[] args)
 {
 //to cal npr or ncr we need the values r and n
 Scanner s = new Scanner(System.in);
 System.out.println("to calculate ncr and npr ");
 System.out.println("Enter the Value of n: ");
 int n = s.nextInt();
 System.out.println("Enter the Value of r: ");
 int r = s.nextInt();
 // after we take the two values
 // cal npr--> npr=n!/(n-r)!
 //cal ncr--> ncr=n!/r!(n-r)!
 int npr = (fact(n)) / (fact(n-r));
 int ncr = npr/fact(r);
 //print the two values
 System.out.println("nCr = " +ncr);
 System.out.println("nPr = " +npr);
 }
}

