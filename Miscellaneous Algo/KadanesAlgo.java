package miscellaneousAlgo;


/*
Kaydans algorithm don't work if all element is negative in an array.
 */
public class KadanesAlgo {

    public static void main(String [] args){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        findMaxSubArray(arr, arr.length);
    }

    public static void findMaxSubArray(int arr[], int n){
        int maxSum = Integer.MIN_VALUE;
        int maxSumSoFar = 0;
        int si = 0;
        int ei = 0;

        for(int i = 0; i< n; i++){
            maxSumSoFar = maxSumSoFar + arr[i];
            if(maxSumSoFar> maxSum){
                maxSum = maxSumSoFar;
                ei = i;
            }

            if(maxSumSoFar < 0){
                maxSumSoFar = 0;
                si = i +1;
            }
        }

        System.out.println("Max Sum: " + maxSum );
        System.out.println("Start index: " + si );
        System.out.println("End index: " + ei );

    }
}
