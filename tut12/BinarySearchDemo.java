package Class.tut12;

import java.util.Scanner;

public class BinarySearchDemo {
    public static void main (String[] args){
        int [] sortedArr = {1, 3, 4, 5, 6, 20, 40, 50, 75, 100};

        System.out.print("Enter the element that you want to search: ");
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();
        inp.close();

        int position = BinarySearch(sortedArr, k, 0, sortedArr.length);
        System.out.println((position != -1) ?"Element " + k + " found at index " + position :"Element " + k + " not found in the array.");
    }

    private static int BinarySearch(int[] A, int k, int low, int high){
        if (high < low)     
            return -1;
        
        int mid = (low + high) /2;
        if (A[mid] == k)   
            return mid;

        else if (A[mid] > k)    
            return BinarySearch(A, k, low, mid - 1);
            
        else 
            return BinarySearch(A, k, mid + 1, high);
    }
}
