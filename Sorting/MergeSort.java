package com.sorting;

/*
time complexity: O(n*log(n))

 */



public class MergeSort {
    public static void main(String [] args){
        int arr[] = {23,12,43,56,45,34};
        mergeSortUtility(arr, 0, arr.length -1);
        ArrayHelperClass.printArray(arr);
    }

    public static void mergeSortUtility(int arr[], int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return;
        }

        int mid = (startIndex + endIndex)/2;
        mergeSortUtility(arr, startIndex, mid);
        mergeSortUtility(arr, mid+1, endIndex);

        mergeSortedArry(arr,startIndex, endIndex);

    }

    public static void mergeSortedArry(int[] arr, int startIndex, int endIndex){
        int mid = (startIndex + endIndex)/2;
        int len1 = mid - startIndex +1;
        int len2 = endIndex - mid;

        int []arr1 = new int[len1];
        int []arr2 = new int[len2];

        int mainArrayIndex = startIndex;
        for(int i =0; i<len1; i++){
            arr1[i] = arr[mainArrayIndex++];
        }

        for(int i = 0; i< len2; i++){
            arr2[i]= arr[mainArrayIndex++];
        }

        // merge two sorted array arr1 and arr2

        int index1 = 0;
        int index2 = 0;
        mainArrayIndex = startIndex;

        while(index1<len1 && index2< len2){
            if( arr1[index1] < arr2[index2]){
                arr[mainArrayIndex++] = arr1[index1++];
            }else{
                arr[mainArrayIndex++] = arr2[index2++];
            }
        }

        while(index1 < len1){
            arr[mainArrayIndex++] = arr1[index1++];
        }

        while(index2 < len2){
            arr[mainArrayIndex++] = arr2[index2++];
        }
    }
}
