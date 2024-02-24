package revesion.matrix;

import java.util.Arrays;

public class MinimumPathSum {
    public static void main(String args[]){
        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
                        };

        MinimumPathSum obj = new MinimumPathSum();
        System.out.println(obj.minPathSum(grid));

    }

    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int dp[][] = new int[row][col];
        for(int i = 0; i< row; i++){
            Arrays.fill(dp[i], -1);
        }

        return solve(grid, dp, row -1, col -1);

    }

    int solve(int[][] grid, int [][]dp, int row, int col){

        if(0 == row  && 0 == col){
            return grid[row][col];
        }

        if( row < 0|| col < 0){
            return (int)Math.pow(10,9);
        }

        if(dp[row][col] != -1){
            return dp[row][col];
        }

        int moveup= grid[row][col] + solve(grid, dp, row, col -1);
        int moveLeft = grid[row][col] + solve(grid, dp, row -1, col);
        dp[row][col] = Math.min(moveLeft, moveup);
        return dp[row][col];

    }

}
