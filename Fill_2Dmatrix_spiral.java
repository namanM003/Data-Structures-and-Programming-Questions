/*Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]*/
public class Solution {
    public int[][] generateMatrix(int n) {
        if(n==0)
            return new int[0][0];
        int matrix[][] = new int[n][n];
        int count=1;
        int row = 0;
        int last_row = matrix.length-1;
        int column = 0;
        int last_column = matrix[0].length-1;
        while(row<=last_row && column <= last_column){
            if(row == last_row+1 && column == last_column+1)
                break;
            for(int i=column;i<=last_column;i++){
                matrix[row][i] = count;
                count++;
            }
            row++;
            for(int i=row;i<=last_row;i++){
                matrix[i][last_column] = count;
                count++;
            }
            last_column--;
            if(row<=last_row){
                for(int i=last_column;i>=column;i--){
                    matrix[last_row][i] = count;
                    count++;
                }
                last_row--;
            }
            if(column<=last_column){
                for(int i=last_row;i>=row;i--){
                    matrix[i][column] = count;
                    count++;
                }
                column++;
            }
        }
        return matrix;
    }
}