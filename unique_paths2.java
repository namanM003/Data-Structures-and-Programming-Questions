/*Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

For example,
There is one obstacle in the middle of a 3x3 grid as illustrated below.

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
The total number of unique paths is 2.

Note: m and n will be at most 100.*/
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length==0)
            return 0;
        if(obstacleGrid[0][0] == 1)
            return 0;
        int matrix[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
        matrix[0][0] = 1;
        for(int i = 1;i<matrix.length;i++){
            if(obstacleGrid[i][0]==0){
                matrix[i][0] = matrix[i-1][0];
            }
            else{
                matrix[i][0] = 0;
            }
        }
        for(int i=1;i<matrix[0].length;i++){
            if(obstacleGrid[0][i]==0){
                matrix[0][i] = matrix[0][i-1];
            }
            else{
                matrix[0][i] = 0;
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(obstacleGrid[i][j]==0)
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
                else
                    matrix[i][j] = 0;
            }
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}