package com.backtracking;

public class TowerOfHanoi {

    static void towerOfHanoiSol(int n, char fromRod, char toRod, char auxRod){
        if(n == 1){
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }

        towerOfHanoiSol(n-1, fromRod,auxRod,toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoiSol(n-1, auxRod, toRod, fromRod);
    }


    public static void main(String args[]){
        int n = 2;
        towerOfHanoiSol(n, 'A','C','B');
    }
}
