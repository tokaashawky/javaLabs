package com.mycompany.comma_in_string;
import java.util.Scanner;

public class Comma_in_string {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter string with comma: ");
        String s=input.nextLine();
        System.out.println("string after leaving comaa would be: ");
        System.out.println(s.replace(",",""));
        
    }
}
