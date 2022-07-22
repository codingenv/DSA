package DynamicProgramming;




public class FrogJump {
    public static void main(String args[]){
        int a[] = {2,4,1,3,5,6,7,3,5,7 };
        // Jump from 0 to 8th Index So n is here 8

        System.out.println(recursiveWay(8, a));
    }

    static int recursiveWay(int n, int a[]){
        if(n == 0) return 0;
        int left = recursiveWay(n-1, a) + Math.abs(a[n] - a[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1) right = recursiveWay(n-2, a) + Math.abs(a[n] - a[n-2]);
        return Integer.min(left,right);
    }

    static int memoizationWay(int n, int a[], int dp){
        return 0;
    }

    static int teculizationWay(int n, int a[]){
        return 0;
    }


    static int spaceOptimizationWay(int n, int a[]){
        return 0;
    }

}
