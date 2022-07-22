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
        System.out.println(tebulizationWay(n, a));
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
        int left = memoizationWay(n-1, a, dp) + Math.abs(a[n] - a[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1) right = memoizationWay(n-2, a, dp) + Math.abs(a[n] - a[n-2]);
        dp[n] =  Integer.min(left,right);
        return dp[n];

    }

    static int tebulizationWay(int n, int a[]){
        int dp[] = new int[n];
        Arrays.fill(dp,0);
        dp[0] = 0;
        for (int i =1; i<n;i++){
            int fs = dp[i-1] + Math.abs(a[i] - a[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1) ss = dp[i-2] + Math.abs(a[i] - a[i-2]);
            dp[i] =  Integer.min(fs,ss);
        }
        return dp[n-1];
    }


    static int spaceOptimizationWay(int n, int a[]){
        return 0;
    }

}
