package GreedyAlgo;

/**
 * Given an array of size n that has the following specifications:

 Each element in the array contains either a policeman or a thief.
 Each policeman can catch only one thief.
 A policeman cannot catch a thief who is more than K units away from the policeman.
 We need to find the maximum number of thieves that can be caught.

 Examples:

 Input : arr[] = {'P', 'T', 'T', 'P', 'T'},
 k = 1. Output : 2.

 Input : arr[] = {'T', 'T', 'P', 'P', 'T', 'P'},
 k = 2. Output : 3.

 Input : arr[] = {'P', 'T', 'P', 'T', 'T', 'P'},
 k = 3. Output : 3.
 */

public class CatchTheives {
    public static void main(String args[]){
        char arr[] = {'P', 'T', 'T', 'P', 'T'};
        int k = 1;

        System.out.println(catchThieves(arr, arr.length, 1));

    }

    /* Winston Solution */
    static int catchThieves(char arr[], int n, int k)
    {

        int tPointer = 0;
        int pPointer = 0;
        int count = 0;

        while(tPointer < n && pPointer < n){

            if(Math.abs(pPointer - tPointer) > k ){
                if(pPointer < tPointer)
                    pPointer++;
                else
                    tPointer++;
            }else if(arr[tPointer] != 'T')
                tPointer++;
            else if(arr[pPointer] != 'P')
                pPointer++;
            else {
                count++;
                tPointer++;
                pPointer++;
            }
        }
        return count;
    }

}
