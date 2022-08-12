package array;

import java.util.Arrays;

public class CountInversions {

    public static void main(String args[]){
        //long[] arr = {36343342, 658445766, 281323766, 703538013, 437455363, 900766801, 84401391, 159903601, 626186515, 127519304, 222484765, 609828661, 190927389, 152625748, 358752776, 522920848, 494568773, 977351598, 782415711, 966011559};
        long[] arr = { 1, 20, 6, 4, 5 };
        System.out.println("Inversion counts: " + getInversions(arr,arr.length) );
    }

    public static long getInversions(long arr[], int n) {

        return mergeSort(arr, 0, n - 1);

    }

    private static long mergeSort(long arr[], int left, int right) {
        long invCount = 0;

        if (right > left) {
            int mid = (right + left) / 2;

            invCount += mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);
            invCount += merge(arr, left, mid + 1, right);
        }
        return invCount;
    }

    private static long merge(long arr[], int left, int mid, int right) {
        int i = left, j = mid, k = 0;
        long invCount = 0;
        long temp[] = new long[(right - left + 1)];

        while ((i < mid) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                ++k;
                ++i;
            }
            else {
                temp[k] = arr[j];
                invCount += (mid - i);
                ++k;
                ++j;
            }
        }

        while (i < mid) {
            temp[k] = arr[i];
            ++k;
            ++i;
        }

        while (j <= right) {
            temp[k] = arr[j];
            ++k;
            ++j;
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
		

        return invCount;
    }


}
