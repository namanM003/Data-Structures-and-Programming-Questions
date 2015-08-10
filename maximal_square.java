/*Given a 2D binary matrix filled with 0's and 1's, find the largest square containing all 1's and return its area.

For example, given the following matrix:

1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
Return 4.*/
public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0)
            return 0;
 
        int matrix_test[][] = new int[matrix.length][matrix[0].length];
        int max = 0;

        //int max = 0;
        int min=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0 || j==0){
                    matrix_test[i][j] = Character.getNumericValue(matrix[i][j]);
                    if(matrix_test[i][j]==1 && max<matrix_test[i][j])
                        max = matrix_test[i][j];
                    continue;
                }
                if(Character.getNumericValue(matrix[i][j])==1){
                    min = Math.min(matrix_test[i-1][j-1],matrix_test[i-1][j]);
                    matrix_test[i][j] = Math.min(min,matrix_test[i][j-1])+1;
                    if(max<matrix_test[i][j]){
                        max = matrix_test[i][j];
                    }
                    
                }
                else
                    matrix_test[i][j] = 0;
            }
        }
        return max*max;
    }
}