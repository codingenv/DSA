package com.sorting;

/*
Time complexity O(n^2)
 */

public class BubbleSort {
    public static void main(String [] args){
        int arr[] = {23,12,43,56,45,34};
        bubbleSort(arr);
        ArrayHelperClass.printArray(arr);
    }

    public static void bubbleSort(int [] arr){
        int len = arr.length;
        for(int i =0; i< len -1 ; i++){
            for(int j = 0 ; j< len -i -1; j++){
                if(arr[j] > arr[j+1]){
                    // swap the numbers;
                    ArrayHelperClass.swap(arr, j, j+1);
                }
            }
        }
    }
}
