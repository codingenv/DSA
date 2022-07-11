package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintingSubsequencesWhereSumIsK {

    public static void printSubsequences(int index, int [] arr, List<Integer> finalArr, int sum){
        if(index >= arr.length){
            if(resturnArraySum(finalArr) == sum){
                System.out.println(finalArr);
            }
            return;
        }
        finalArr.add(arr[index]);
        printSubsequences(index+1,arr, finalArr, sum);
        finalArr.remove(finalArr.size() -1);
        printSubsequences(index+1, arr, finalArr, sum);
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
        printSubsequences(0,arr,new ArrayList<Integer>(),k);
    }
}
