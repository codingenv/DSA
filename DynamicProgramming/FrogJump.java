package DynamicProgramming;


import java.util.Arrays;

public class FrogJump {
    public static void main(String args[]){
        int a[] = {2,4,1,3,5,6,7,3,5,7 };
        // Jump from 0 to 8th Index So n is here 8
        int n = 8;
        System.out.println(recursiveWay(n, a));

        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(memoizationWay(n, a,dp));
    }

    static int recursiveWay(int n, int a[]){
        if(n == 0) return 0;
        int left = recursiveWay(n-1, a) + Math.abs(a[n] - a[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1) right = recursiveWay(n-2, a) + Math.abs(a[n] - a[n-2]);
        return Integer.min(left,right);
    }

    static int memoizationWay(int n, int a[], int dp[]){
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];
        int left = recursiveWay(n-1, a) + Math.abs(a[n] - a[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1) right = recursiveWay(n-2, a) + Math.abs(a[n] - a[n-2]);
        dp[n] =  Integer.min(left,right);
        return dp[n];

    }

    static int tebulizationWay(int n, int a[]){
        return 0;
    }


    static int spaceOptimizationWay(int n, int a[]){
        return 0;
    }

}
