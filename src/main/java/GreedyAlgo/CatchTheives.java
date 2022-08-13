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

    /* From Geeks for geeks */

    static int policeThief(char arr[], int n, int k)
    {
        int pol = -1, thi = -1, res = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P') {
                pol = i;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'T') {
                thi = i;
                break;
            }
        }

        // return 0 if no police OR no thief found
        if (thi == -1 || pol == -1)
            return 0;
        // loop to increase res iff distance between police
        // and thief <= k
        while (pol < n && thi < n) {

            if (Math.abs(pol - thi) <= k) {

                pol++;
                while (pol < n && arr[pol] != 'P')  pol++;

                thi = thi + 1;
                while (thi < n && arr[thi] != 'T')  thi++;

                res++;
            } else if (thi < pol) {
                // as index of thief is behind police, we
                // need to find the next thief and check if
                // it can be caught by the current police
                // (it will be checked in the next
                // iteration) Hence, find the index of next
                // thief
                thi++;
                while (thi < n && arr[thi] != 'T') thi++;
            } else {
                // as the index of police is behind the
                // thief, it cannot catch the thief. Hence,
                // we need the index of next police and
                // check if it can catch the current thief
                // (it will be checked in the next
                // iteration)
                pol++;
                while (pol < n && arr[pol] != 'P') pol++;
            }
        }

        return res;
    }

}
