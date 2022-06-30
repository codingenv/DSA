package com.sorting;

/*
Time complexity: O(n^2)
Space complexity O(1)
 */
public class SelectionSort {
    public static void main(String [] args){
        int arr[] = {23,12,43,56,45,34};
        selectionSort(arr);
        ArrayHelperClass.printArray(arr);
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
