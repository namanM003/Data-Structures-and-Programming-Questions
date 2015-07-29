/*Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.*/
public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length==0){
            return 0;
         
        }
        if(grid.length==1 && grid[0].length==1){
            return grid[0][0];
        }
        int row =0;
        int column =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int min = Integer.MAX_VALUE;
                if(j>0){
                    min = grid[i][j]+grid[i][j-1];
                    
                }
                if(i>0){
                    min = Math.min(min,grid[i][j]+grid[i-1][j]);
                }
                if(i!=0 || j!=0)
                    grid[i][j] = min;
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
   
}