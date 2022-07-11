package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintingSubsequences {

    public static void printSubsequences(int index, int [] arr, List<Integer> finalArr){
        if(index >= arr.length){
            System.out.println(finalArr);
            return;
        }
        finalArr.add(arr[index]);
        printSubsequences(index+1,arr, finalArr);
        finalArr.remove(finalArr.size() -1);
        printSubsequences(index+1, arr, finalArr);
    }

    public static void main(String [] args){
        int []arr = {3,2,1};

        printSubsequences(0,arr,new ArrayList<Integer>());
    }
}
