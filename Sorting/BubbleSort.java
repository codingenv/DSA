package Sorting;

/*
Time complexity O(n^2)
 */

public class BubbleSort {
    public static void main(String [] args){
        int arr[] = {23,12,43,56,45,34};
        bubbleSort(arr);
        ArrayHelperClass.printArray(arr);
        int arrRecursive[] = {23,12,43,56,45,34};
        bubbleSort(arrRecursive);
        ArrayHelperClass.printArray(arrRecursive);
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

    public static void bubbleSortRecursive(int n, int arr[]) {
        if (n == 1) return;

        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ArrayHelperClass.swap(arr, i, i + 1);
                count++;
            }
            if (count == 0) return;
            bubbleSortRecursive(n - 1, arr);
        }
    }
}
