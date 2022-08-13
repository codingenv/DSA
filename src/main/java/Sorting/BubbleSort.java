package Sorting;

/*
Time complexity O(n^2)
 */

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {23, 12, 43, 56, 45, 34};
        bubbleSort(arr);
        ArrayHelperClass.printArray(arr);
        int arrRecursive[] = {23, 12, 43, 56, 45, 34};
        bubbleSortRecursive(arrRecursive.length, arrRecursive);
        ArrayHelperClass.printArray(arrRecursive);
        int arrAllRecursive[] = {23, 12, 43, 56, 45, 34};
        bubbleSortAllRecursive(0, arrAllRecursive.length,
                arrAllRecursive);
        ArrayHelperClass.printArray(arrAllRecursive);
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap the numbers;
                    ArrayHelperClass.swap(arr, j, j + 1);
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
        if (start == size) return;

        recurse(0, size, arr);
        bubbleSortAllRecursive(start, size - 1, arr);

    }

    private static void recurse(int start, int size, int[] arr) {
        if (start == size - 1) return;
        if (arr[start] > arr[start + 1]) ArrayHelperClass.swap(arr, start, start + 1);
        recurse(start + 1, size, arr);
    }
}
