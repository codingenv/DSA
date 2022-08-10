package array;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LargestElementTotheRight {
    public static void main(String args[]){
        int arr[] ={1,3,0,0,1,2,4 };
        List<Integer> result = new LinkedList<>();
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
            for(Integer item : result){
                System.out.println(item);
            }
        }


    }
}
