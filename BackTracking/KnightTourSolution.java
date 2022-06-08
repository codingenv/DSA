package com.backtracking;


/*

This process prints all the possible solution.

 */

public class KnightTourSolution {

    public static void printKnightTour(int[][] chess, int r, int c, int move){

        if(r<0 || c< 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0){
            return;
        }else if(move == chess.length * chess.length){
            chess[r][c] = move;
            displayBorad(chess);
            chess[r][c] =0;
            return;
        }
        chess[r][c]  = move;

        printKnightTour(chess, r-2, c+1, move+1);
        printKnightTour(chess, r-1, c+2, move+1);
        printKnightTour(chess, r+1, c+2, move+1);
        printKnightTour(chess, r+2, c+1, move+1);
        printKnightTour(chess, r+2, c-1, move+1);
        printKnightTour(chess, r+1, c-2, move+1);
        printKnightTour(chess, r-1, c-2, move+1);
        printKnightTour(chess, r-2, c-1, move+1);

        chess[r][c] = 0;

    }

    public static void displayBorad(int[][] chess){
        System.out.println("Solution: ");
        for(int i =0; i<chess.length ; i++){
            for(int j = 0; j<chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        int n = 5;
        int row = 0;
        int column = 0;
        int [][] chess = new int[n][n];
        printKnightTour(chess, row,column, 1);
    }
}
