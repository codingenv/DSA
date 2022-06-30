package com.sorting;

/*
The worst case time complexity of Insertion sort is O(N^2)
The average case time complexity of Insertion sort is O(N^2)
The time complexity of the best case is O(N).
The space complexity is O(1)
 */

public class InsertionSort {
    public static void main(String [] args){
        int arr[] = {23,12,43,56,45,34};
        insertionSort(arr);
        ArrayHelperClass.printArray(arr);
    }

    public static void insertionSort(int []arr){
        for(int i =1; i< arr.length; i++){
            int temp  = arr[i];

            int j = i-1;
            while(j>=0  &&  arr[j] >temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
