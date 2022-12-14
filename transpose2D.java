package com.mycompany.lab2_2;
import java.util.Scanner;
public class transpose2D {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //get row and col to create 2d array
        System.out.println("to Make transpose for Matrix.. ");
        System.out.println("Enter row and columns of 2d array (Matrix): ");
        int row = scan.nextInt();
	int column = scan.nextInt();
        //create arrary and get its values from user
        int [][] arr = new int[row][column];
        for( int i = 0; i < row; i++)
   	    for( int k = 0; k < column; k++) 
        	arr[i][k] = scan.nextInt();
        System.out.println("Matrix before Transpose : ");
        //make for read in each row all its values of columns (row&col)
  	for( int i = 0; i < row; i++)
    	{
      	    for(int k = 0; k < column; k++)
            {
          	System.out.print(arr[i][k]+" ");
            }
            System.out.println(" ");
        }
 	System.out.println("matrix after Transpose is :");
        //make for read in each col all its values of rows (col&row)
  	for(int i = 0; i < column; i++)
    	{
      	    for(int k = 0; k < row; k++)
            {
                System.out.print(arr[k][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
