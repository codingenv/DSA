package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CountNumberOfSilutionSubsequencesWhereSumIsK {

    public static int printSubsequences(int index, int [] arr, List<Integer> finalArr, int sum){
        if(index >= arr.length){
            if(resturnArraySum(finalArr) == sum){
                return 1;
            }
            return 0;
        }
        finalArr.add(arr[index]);
        int l = printSubsequences(index+1,arr, finalArr, sum);
        finalArr.remove(finalArr.size() -1);
        int r = printSubsequences(index+1, arr, finalArr, sum);
        return l + r;
    }

    public static int resturnArraySum(List<Integer> list){
        int sum = 0;
        if(list.size() != 0) {
            for (Integer i : list) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String [] args){
        int []arr = {5,4,3,2,1};
        int k = 7;
        System.out.println("Total number of solution " + printSubsequences(0,arr,new ArrayList<Integer>(),k));
    }
}
