package Array;

/*
Walmart:
Given a String like 1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,10 print range of a number
which is repeated most number of times continiuously.
Example: 1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,1 Answer: 6,11 (2 repeated most number
of times from index 6 to 11)
 */
public class FindMaxRange {
    public static void main(String [] args){
        int arr[] = {1,1,2,2,3,4,2,2,2,2,2,2,8,9};

        int currentlength = 0;
        int prevlength = 0;

        int currentStartIndex  = 0;
        int prevStartIndex = 0;

        int prevEndIndex = 0;
        int currentEndIndex  = 0;

        for(int i = 0, j = 1; i < arr.length && j <arr.length;  ){

            if(arr[i] == arr[j]){
                currentlength = currentEndIndex +1;
                if(currentStartIndex == 0){
                    currentStartIndex = i;
                }
                if(currentEndIndex ==0){
                    currentEndIndex = j;
                }

                if(currentlength > prevlength){

                    prevlength = currentlength;
                }
                j++;
            }else{
                i++;
                j++;
            }
        }
        System.out.println(currentStartIndex);
        System.out.println(currentEndIndex);
    }
}
