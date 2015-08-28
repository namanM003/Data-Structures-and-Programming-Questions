/*Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.*/
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        
        int last_row = matrix.length-1;
        int last_column = 0;
        while(last_row >= 0 && last_column<matrix[0].length){
            if(matrix[last_row][last_column]==target)
                return true;
            else
                if(matrix[last_row][last_column] > target)
                    last_row--;
                else
                    last_column++;
        }
        return false;
        
    }
}