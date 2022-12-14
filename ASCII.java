package com.mycompany.ascii;
import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //get from the user the number present the ascii of the char
        System.out.println("press ASCII Value to be converted: ");
        int asciivalue = input.nextInt();
        // cast the int value to char to get the char of this ascii
        char asciichar = (char)asciivalue;
        System.out.printf("value after converted be character --> %c",asciichar);

    }
}
