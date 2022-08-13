package Searching;

public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {34,40,45,50,55,60};
        int key = 40;
        System.out.println("Key is found at index: " + binarySearch(arr, 0, arr.length -1 ,key));
    }

    public static int binarySearch(int []arr, int startIndex, int lastIndex ,int key){
        if(startIndex <= lastIndex) {

            int mid = ((startIndex + lastIndex-1) / 2) + 1;

            if (arr[mid] > key) {
                return binarySearch(arr, startIndex, mid-1, key);
            } else if (arr[mid] < key) {
                return binarySearch(arr, mid+1, lastIndex, key);
            } else {
                return mid;
            }
        }else{
            return -1;
        }
    }
}
