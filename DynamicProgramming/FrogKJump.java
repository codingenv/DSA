package DynamicProgramming;


import java.util.Arrays;

public class FrogKJump {
    public static void main(String args[]){
        int a[] = {2,4,1,3,5,6,7,3,5,7 };
        // Jump from 0 to 8th Index So n is here 8
        int n = 8;
        int k = 2;
        System.out.println(recursiveWay(n, a, k));

        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(memoizationWay(n, a, k, dp));
        System.out.println(tebulizationWay(n, k, a));
    }

    static int recursiveWay(int n, int a[], int k){
        if(n == 0) return 0;
        int minSteps = Integer.MAX_VALUE;
        for(int j = 1; j<=k ;j++){
            if(n - j >= 0) {
                int jumps = recursiveWay(n - j, a, k) + Math.abs(a[n] - a[n - j]);
                minSteps = Math.min(jumps, minSteps);
            }
        }
        return minSteps;
    }

    static int memoizationWay(int n, int a[], int k, int dp[]){
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];
        int minSteps = Integer.MAX_VALUE;
        for(int j = 1; j<=k ;j++){
            if(n - j >= 0) {
                int jumps = memoizationWay(n - j, a, k, dp) + Math.abs(a[n] - a[n - j]);
                minSteps = Math.min(jumps, minSteps);
            }
        }
        dp[n] = minSteps;
        return dp[n];
    }

    static int tebulizationWay(int n, int k, int a[]){
        int dp[] = new int[n];
        Arrays.fill(dp,0);
        dp[0] = 0;
        for (int i =1; i<n;i++) {
            int minSteps = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jumps = dp[i - j] + Math.abs(a[i] - a[i - j]);
                    minSteps = Math.min(jumps, minSteps);
                }
            }
            dp[i] = minSteps;
        }
        return dp[n-1];

    }


}
