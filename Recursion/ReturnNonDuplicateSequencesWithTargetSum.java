package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ReturnNonDuplicateSequencesWithTargetSum {

    public static void printSubsequences(int index, int [] arr, List<Integer> finalArr, int sum, HashSet<List<Integer>> targetSequenceSum){
        if(index >= arr.length){
            if(resturnArraySum(finalArr) == sum){
                targetSequenceSum.add(copyArray(finalArr));
                //System.out.println(finalArr);
            }
            return;
        }
        finalArr.add(arr[index]);
        printSubsequences(index+1,arr, finalArr, sum, targetSequenceSum);
        finalArr.remove(finalArr.size() -1);
        printSubsequences(index+1, arr, finalArr, sum, targetSequenceSum);
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

    public static List<Integer> copyArray(List<Integer> arr){
        List<Integer> returnList = new ArrayList<>();
        for(Integer i: arr){
            returnList.add(i);
        }
        return returnList;
    }

    public static void main(String [] args){
        int []arr = {1,1,1,2,2};
        int k = 4;
        HashSet<List<Integer>> targetSequenceSum = new HashSet<>();
        printSubsequences(0,arr,new ArrayList<Integer>(),k, targetSequenceSum);

        for(List<Integer> item : targetSequenceSum){
            System.out.println(item);
        }
    }
}
