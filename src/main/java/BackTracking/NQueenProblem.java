package BackTracking;

public class NQueenProblem {

    public static void printNQueue(int [][]chess, String qsf, int row){
        if(row == chess.length){
            System.out.println(qsf + ".");
            return;
        }

        for(int col = 0; col < chess.length ; col++){
            if(chess[row][col] == 0 && isQueueSafe(chess, row, col ) == true){
                chess[row][col] = 1;
                printNQueue(chess,qsf + row+ "-" + col + "," , row + 1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isQueueSafe(int [][] chess, int row, int col){
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0
                && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col - 1; j >= 0; j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        return true;
    }



    public static void main(String [] args){
        int n =4;
        int board[][] = new int[n][n];
        printNQueue(board, "", 0);
    }
}
