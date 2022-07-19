package Sorting;

public class SortInOrderN {
    public static void main(String args[]){
        int []arr = {3,2,4,1,12,16,7,9,};

        int length = arr.length;
        int []auxArr = new int[20];
        for(int i =0 ; i<auxArr.length; i++){
            auxArr[i] = -1;
        }

        for(int i = 0; i<length; i++){
            auxArr[arr[i]] = arr[i];
        }

        for(int i =0 , j=0;i<auxArr.length;i++){
            if(auxArr[i] != -1){
                arr[j] = auxArr[i];
                j++;
            }
        }

        for(int i = 0; i< arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
}
