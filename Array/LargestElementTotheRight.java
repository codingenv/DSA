package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LargestElementTotheRight {
    public static void main(String args[]){
        int arr[] ={1,3,0,0,1,2,4 };
        int finalResult[] = new int[arr.length];
        List<Integer> result = new ArrayList<>();
        Stack<Integer> tempStore = new Stack<>();

        tempStore.push(arr[arr.length -1]);
        result.add(-1);
        for(int i = arr.length -2; i>=0; i--){
            while(!tempStore.empty()){
                if(tempStore.peek() > arr[i]){
                    result.add(tempStore.peek());
                    break;
                }
                else tempStore.pop();
            }
            if(tempStore.empty()) result.add(-1);
            tempStore.push(arr[i]);
        }

        if(result.size() != 0){
            int j =0;
            for(int i = result.size() -1; i>=0;i--){
                finalResult[j++] = result.get(i);
            }
        }

        for(int i =0; i<finalResult.length; i++){
            System.out.println(finalResult[i]);
        }


    }
}
