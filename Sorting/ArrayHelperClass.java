package com.sorting;

public class ArrayHelperClass {
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] +  " ");
        }
        System.out.println();
    }

    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}
