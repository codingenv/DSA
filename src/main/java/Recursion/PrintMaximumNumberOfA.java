package Recursion;

public class PrintMaximumNumberOfA {

    static int findOptimal(int n){
        if(n<6){
            return n;
        }

        int max = 0;
        int b;
        for(b = n-3; b>=1; b--){
            int curr = (n-b-1)*findOptimal(b);
            if(curr > max){
                max = curr;
            }
            return curr;
        }
        return max;
    }

    public static void main(String args[]){
        System.out.println(findOptimal(3));
        System.out.println(findOptimal(9));
        System.out.println(findOptimal(7));

    }
}
