package com.mycompany.quicksort;
import java.util.Scanner;
public class Quicksort {
    static Scanner input=new Scanner(System.in);
    public static int partition(int [] array,int low,int high)
    {
        // left element be pivot
        int pivot = array[high];//high =size-1
        // i point to the first element-1
        int i = (low - 1);
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            //
            if (array[j] <= pivot) {
                // if element smaller than pivot increase i to take first large value
                i++;
                // swap element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            //end of this loop we will have pivot in right numbers larger than it
            //in the left Numbers less or equal than it (elements not sorted)
        }
        // swap the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        // return the position from where partition is done
        return i + 1;
    }
        // method to find the partition position
    static void quickSort(int array[], int low, int high)
    {
    if (low < high) {
        // find pivot element such the elements smaller than pivot are on the left
        // elements greater than pivot are on the right ,in each two elements are sorted
        int pivo = partition(array, low, high);
        // sort elements on the left of pivot
        quickSort(array, low, pivo - 1);
        // sort elements on the right of pivot
        quickSort(array, pivo + 1, high);
    }
    }
    public static void main(String[] args){
                System.out.println("Enter size of array: ");
                int size=input.nextInt();
                int [] arr=new int[size];
                System.out.println("Enter the array elements: ");
                for(int i=0;i<arr.length;i++)
                    arr[i]=input.nextInt();
                 System.out.println("Array before sorting: ");
                for(int num:arr)
                   System.out.print(num+" ");
                System.out.println();
                quickSort(arr,0,size-1);
                 System.out.println("Array after sorting: ");
                 for(int num:arr)
                   System.out.print(num+" ");
                
            }
}
