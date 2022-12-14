package com.mycompany.shapes;
import java.util.Scanner;
public class Shapes {
    //create method one to cal area of triangle 
    public static void area(int  b, int h) {
        // area of triangle= 0.5*base*height
        int Area_of_triangle = (b * h)/2;
        System.out.printf("Area of Triangle = %d" ,Area_of_triangle);
        System.out.println();
        
    }
    //create method two to cal circumference of triangle 
    public static void circumference(int a, int b,int c)
    { // circumference of triangle equal sum of the three sides
        int circumf_triangle = a+b+c;
        System.out.printf("circumference = %d" ,circumf_triangle);
        
    }
    //create method threee to cal area of circle 
    public static void area(double r) {
        //area of circle= pi*r^2
        double Area_of_circle = Math.PI * r * r;
        System.out.printf("Area of circle = %f" , Area_of_circle);
        System.out.println();

    }
    //create method threee to cal area of circle 
    public static void circumference(double r)
    {
        //circumference of circle=2*pi*r
        double circumf_circle = Math.PI * r * 2;
        System.out.printf("circumference = %f" ,circumf_circle);
        
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("press 1 to triangle\n2 to cicle  ");
    int option=input.nextInt();
    switch(option)
    { // if option is 1 we cal operation on triangle
        //if option were 2 we cal operation on circle
        // if not 1 or 2 we consider it as invaild option
        case 1:
            System.out.println("Enter side1 of triangle: ");
            int side1=input.nextInt();
            System.out.println("Enter side2 of triangle: ");
            int side2=input.nextInt();
            System.out.println("Enter base of triangle: ");
            int base=input.nextInt();
            System.out.println("Enter height of triangle: ");
            int height=input.nextInt();
            area(base,height);
            circumference(side1, side2,base);
            break;
        case 2:
            System.out.println("Enter radios of cicle: ");
            double r=input.nextDouble();
            area(r);
            circumference(r);
            break;
        default:
             System.out.println("Invalid option^_^ ");         
    }
    }
}
