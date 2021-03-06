package DynamicProgramming;

import java.util.Arrays;

public class MaxSumOfNonAdjacentElement {
    public static void main(String args[]){
        int arr[] = {1,3,2,4,8,3,9};
        System.out.println("Max sum of non adjacent element in java: " + maxSumOfNonAdjacentElement(arr));
        System.out.println("Max sum of non adjacent element in java: " + maxSumOfNonAdjacentElementDp(arr));
        System.out.println("Max sum of non adjacent element in java: " + maxSumOfNonAdjacentElementDpTabulation(arr));
    }


    /*
        Recursive way
     */
    public static int maxSumOfNonAdjacentElement(int arr[]) {
        return findMaxSum(arr.length-1, arr);
    }

    public static int findMaxSum(int index, int [] arr){
        if(index == 0) return arr[index];
        if(index < 0) return 0;

        int pick = arr[index] + findMaxSum(index -2, arr);
        int notPick = 0 + findMaxSum(index-1,arr);

        return Math.max(pick, notPick);
    }

    /*
        Converting to Memoization [Dp]
     */

    public static int maxSumOfNonAdjacentElementDp(int arr[]) {
        int dp[] = new int[arr.length + 1];
        Arrays.fill(dp, -1);
        return findMaxSumDp(arr.length-1, arr, dp);
    }

    public static int findMaxSumDp(int index, int [] arr, int dp[]){
        if(index == 0) return arr[index];
        if(index < 0) return 0;

        if(dp[index] != -1) return dp[index];

        int pick = arr[index] + findMaxSum(index -2, arr);
        int notPick = 0 + findMaxSumDp(index-1,arr,dp);

        dp[index] =  Math.max(pick, notPick);
        return dp[index];
    }

    /*
        Convert to Tabulation (DP)
     */

    public static int maxSumOfNonAdjacentElementDpTabulation(int arr[]) {
        int dp[] = new int[arr.length + 1];
        Arrays.fill(dp, -1);

        dp[0] = arr[0];


        for(int i = 1; i< arr.length; i++){
            int pick = 0;
            if(i-2 < 0) pick = arr[i] + 0;
            else pick = arr[i] + dp[i-2];
            int notPick = 0 + dp[i - 1];

            dp[i] =  Math.max(pick, notPick);
        }
        return dp[arr.length -1];

    }
}

























