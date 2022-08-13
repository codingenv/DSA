package Searching;

/*
    ideal block size should be  = sqrt of (length of array)
    Time complexity will be O(sqrt(n))
    Auxiliary Space : O(1)
    Works only with sorted array
 */
public class JumpSearch {
    public static void main(String args[]){
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int key = 377;
        System.out.println("Key is found at index: " + jumpSearch(arr,key));
    }

    public static int jumpSearch(int [] arr, int key){
        int length = arr.length;
        Double d= Double.valueOf(length);
        int blockSize = (int)Math.sqrt(d);

        int i = 0;
        for(; i< length; i = i+blockSize){
            if(arr[i] == key){
                return i;
            }if(arr[i] > key){
                i = i - blockSize;
                break;
            }
        }
        // Checking if i passes the last block also.
        if(i >= arr.length){
            i = i - blockSize;
        }

        // Checking in the next available block.
        while(i<arr.length){
            if(arr[i] == key){
                return i;
            }
            i++;
        }
        return -1;
    }
}
