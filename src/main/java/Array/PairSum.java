package Array;

import java.util.* ;
import java.io.*; 




/*
You are given an integer array 'ARR' of size 'N' and an integer 'S'. Your task 
is to return the list of all pairs of elements such that each sum of elements 
of each pair equals 'S'.

Testing.


I/P:
5 0
2 -3 3 3 -2

O/P: 
-3 3
-3 3
-2 2
*/

public class PairSum{
    public static int[][] pairSum(int[] arr, int s) {
        Arrays.sort(arr);
        List<Integer[]> result = new ArrayList<>();
        
       
        int l=0;
        int r=arr.length -1;
        
        while(l<r){
            if(arr[l] + arr[r] > s){
                r--;
            }else if(arr[l] + arr[r] < s){
                l++;
            }else{
                if(arr[l] == arr[r]){
                    int count = r -l +1;
                    int pairCount = count * (count -1)/2;
                    for(int i =0; i< pairCount ;i ++){
                        Integer [] resultSet = new Integer[2];
                        resultSet[0] = arr[l];
                        resultSet[1] = arr[l];
                        result.add(resultSet);
                    }
                    break;
                }else{
                    int leftCount = 1;
                    int rightCount = 1;
                    
                    for(int i = l+1; i<r-1; i++){
                        if(arr[l] == arr[i]){
                            leftCount++;
                        }
                    }
                                        
                    for(int i = r-1 ; i>l+1; i--){
                        if(arr[r] == arr[i]){
                            rightCount++;
                        }
                    }
                    
                    for(int i =leftCount ; i>0; i--){
                        for(int j =rightCount; j>0; j--){
                            Integer [] resultSet = new Integer[2];
                            resultSet[0] = arr[l];
                            resultSet[1] = arr[r];
                            result.add(resultSet);
                        }
                    }
                    l = l + leftCount ;
                    r = r - rightCount ;
                }
            }
        }
       
        int resultArr[][] = new int[result.size()][2];
        int i = 0;
        for(Integer[] item : result){
            resultArr[i][0] = item[0];
            resultArr[i][1] = item[1];
            i++;
        }
        
        return resultArr;
        
    }
}
