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
        bubbleSortRecursive(arrRecursive.length, arrRecursive);
        ArrayHelperClass.printArray(arrRecursive);
        int arrAllRecursive[] = {23,12,43,56,45,34};
        bubbleSortAllRecursive(0,arrAllRecursive.length,
                arrAllRecursive);
        ArrayHelperClass.printArray(arrAllRecursive);
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

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ArrayHelperClass.swap(arr, i, i + 1);
            }
            bubbleSortRecursive(n - 1, arr);
        }
    }


    private static void bubbleSortAllRecursive(int start, int size, int arr[]) {
        if(start == size) return;
        if(!recurse(0, size, false, arr)) return;
        bubbleSortAllRecursive(start, size -1, arr);
    }

    private static boolean recurse(int start, int size, boolean swapped, int []arr) {
        if (start == size - 1) return swapped;

        if (arr[start] > arr[start + 1]) {
            int temp = arr[start];
            arr[start] = arr[start + 1];
            arr[start + 1] = temp;

            swapped = true;
        }
        return swapped;
    }

}
