package Searching;

public class LinearSearch {

    public static void main(String args[]){
        int arr[] = {3,34,12,34,44,65,33};
        int key = 44;
        System.out.println("Key is found at index: " + linearSearch(arr, key));

    }

    // return the index if key is found else return -1
    // time complexity O(n).
    // Space complexity O(1);
    public static int linearSearch(int []arr, int key){
        int len = arr.length;
        for(int i = 0; i< len; i++){
            if(arr[i] == key){
                // Key is found
                return i;
            }
        }
        // key is not found.
        return -1;
    }

}
