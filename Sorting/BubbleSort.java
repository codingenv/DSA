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
        for(int i =0; i< len; i++){
            for(int j = i +1; j< len; j++){
                if(arr[i] > arr[j]){
                    // swap the numbers;
                    ArrayHelperClass.swap(arr, i, j);
                }
            }
        }
    }
}
