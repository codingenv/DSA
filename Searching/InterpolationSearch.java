package com.searching;


/*
Let's assume that the elements of the array are linearly distributed.

General equation of line : y = m*x + c.
y is the value in the array and x is its index.

Now putting value of lo,hi and x in the equation
arr[hi] = m*hi+c ----(1)
arr[lo] = m*lo+c ----(2)
x = m*pos + c     ----(3)

m = (arr[hi] - arr[lo] )/ (hi - lo)

subtracting eqxn (2) from (3)
x - arr[lo] = m * (pos - lo)
lo + (x - arr[lo])/m = pos
pos = lo + ((x - arr[lo])   *    (hi - lo)/(arr[hi] - arr[lo]))

Its time complexity is better than binary search.
 */

public class InterpolationSearch {
    public static void main(String[] args)
    {
        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };
        int n = arr.length;

        int x = 18;
        int index = interpolationSearch(arr, 0, n - 1, x);
        System.out.println("Element found at index " + index);
    }

    public static int interpolationSearch(int arr[], int lo, int hi, int x)
    {
        int pos;

        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {

            // Probing the position with keeping uniform distribution in mind.
            pos = lo +  (  (x - arr[lo])    *    ((hi - lo) / (arr[hi] - arr[lo]))    );

            if (arr[pos] == x) {
                return pos;
            } else if(arr[pos] < x) {
                return interpolationSearch(arr, pos + 1, hi, x);
            } else if (arr[pos] > x) {
                return interpolationSearch(arr, lo, pos - 1, x);
            }
        }
        return -1;
    }
}
