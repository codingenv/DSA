package com.searching;

/*Complexity
    Time : OLog(n)


 */
public class ExponentialSearch {
    public static void main(String args[])
    {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 50;
        int result = exponentialSearch(arr, x);

        System.out.println((result < 0) ?
                "Element is not present in array" :
                "Element is present at index " +
                        result);
    }


    public static int exponentialSearch(int arr[], int key){
        if(arr[0] == key){
            return 0;
        }
        int len = arr.length;
        int i = 1;
        while(i< len){
            if(arr[i] == key) {
                return i;
            }else if (arr[i] < key){
                i = i * 2;
            }else{
                break;
            }
        }
        return BinarySearch.binarySearch(arr,i/2, Math.min(i, len-1), key);

    }
}
