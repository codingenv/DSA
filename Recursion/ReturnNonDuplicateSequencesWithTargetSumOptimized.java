package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ReturnNonDuplicateSequencesWithTargetSumOptimized {

    private static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = ind; i < arr.length;i++) {
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) break;

            ds.add(arr[i]);
            findCombinations(i+1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String [] args){
        int []arr = {1,1,1,2,2};
        int k = 4;

        List<List<Integer>> list = combinationSum2(arr,k);

        for(List<Integer> item : list){
            System.out.println(item);
        }
    }
}
