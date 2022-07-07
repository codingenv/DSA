package DynamicProgramming;


// /* Problem Name is &&& Optimal Path &&& PLEASE DO NOT REMOVE THIS LINE. */

 /*
 ** Instructions to candidate.
 **  1) You are an avid rock collector who lives in southern California. Some rare
 **     and desirable rocks just became available in New York, so you are planning
 **     a cross-country road trip. There are several other rare rocks that you could
 **     pick up along the way.
 **
 **     You have been given a grid filled with numbers, representing the number of
 **     rare rocks available in various cities across the country.  Your objective
 **     is to find the optimal path from So_Cal to New_York that would allow you to
 **     accumulate the most rocks along the way.
 **
 **     Note: You can only travel either north (up) or east (right).
 **  2) Consider adding some additional tests in doTestsPass().
 **  3) Implement optimalPath() correctly.
 **  4) Here is an example:
 **                                                           ^
 **                 {{0,0,0,0,5}, New_York (finish)           N
 **                  {0,1,1,1,0},                         < W   E >
 **   So_Cal (start) {2,0,0,0,0}}                             S
 **                                                           v
 **   The total for this example would be 10 (2+0+1+1+1+0+5).
 */

 class Solution {
   /*
    **  Find the optimal path.
    */
   public static int optimalPath(int[][] grid) {

       int row = grid.length;
       int col = grid[0].length;

       System.out.println("Row " + row);
       System.out.println("Col " + col);
       for(int i = 0; i < row; i++){
           for(int j = 0; j < col; j++){
               System.out.print(grid[i][j] + " ");
           }
           System.out.println();
       }

       System.out.println();

       int [][]dp = new int[row][col];

       for(int i = row -1; i>=0; i-- ){
         for(int j = col-1; j>= 0; j--){

           if(i == row-1 && j == 0){
              dp[i][j] = grid[i][j];
           }else if( i == row-1){
             dp[i][j] = dp[i][j+1] + grid[i][j];
           }else if( j == 0){
               dp[i][j] = dp[i-1][j] + grid[i][j];
           }else{
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j+1]);
           }

         }
       }

       for(int i =0; i < row; i++){
           for(int j = 0; j < col; j++){
               System.out.print(dp[i][j] + " ");
           }
           System.out.println();
       }

       System.out.println();

        System.out.println(dp[0][col-1]);
        return dp[0][col-1];
   }

   /*
    **  Returns true if the tests pass. Otherwise, returns false;
    */
   public static boolean doTestsPass() {
     boolean result = true;
     // Base test case
     result &= optimalPath(new int[][]{
         {0, 0, 0, 0, 5},
         {0, 1, 1, 1, 0},
         {2, 0, 0, 0, 0}}) == 10;
     return result;
   }

   /*
    **  Execution entry point.
    */
   public static void main(String[] args) {
     if (doTestsPass()) {
       System.out.println("All tests pass");
     } else {
       System.out.println("Tests fail.");
     }
   }
 }