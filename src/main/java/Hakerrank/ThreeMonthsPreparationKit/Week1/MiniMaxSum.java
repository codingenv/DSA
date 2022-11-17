package Hakerrank.ThreeMonthsPreparationKit.Week1;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-mini-max-sum/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one&h_r=next-challenge&h_v=zen


import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {
    public static void main(String [] args){
        List<Integer> arr = Arrays.asList(5,5,5,5,5);
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        int maxNumber =  Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for(Integer i: arr){
            if(i > maxNumber) maxNumber = i;
            if(i< minNumber) minNumber = i;
        }

        //System.out.println("MaxNumber: " + maxNumber);
        //System.out.println("MinNumber: " + minNumber);

        long maxSum = 0;
        long minSum = 0;
        Boolean maxFlag = Boolean.FALSE;
        Boolean minFlag = Boolean.FALSE;

        for(Integer i: arr){
            if(i != minNumber || minFlag){
                maxSum = maxSum + i;
            }else{
                minFlag = Boolean.TRUE;
            }

            if(i != maxNumber || maxFlag){
                minSum = minSum + i;
            }else{
                maxFlag = Boolean.TRUE;
            }
        }

        System.out.println(minSum + " " + maxSum);



    }
}
