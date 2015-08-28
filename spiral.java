/*Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].*/
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length==0)
            return new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        int row = 0;
        int last_row = matrix.length-1;
        int column = 0;
        int last_column = matrix[0].length-1;
        while(row<=last_row && column <= last_column){
            if(row == last_row+1 && column == last_column+1)
                break;
            for(int i=column;i<=last_column;i++){
                list.add(matrix[row][i]);
            }
            row++;
            for(int i=row;i<=last_row;i++){
                list.add(matrix[i][last_column]);
            }
            last_column--;
            if(row<=last_row){
                for(int i=last_column;i>=column;i--)
                    list.add(matrix[last_row][i]);
                last_row--;
            }
            if(column<=last_column){
                for(int i=last_row;i>=row;i--)
                    list.add(matrix[i][column]);
                column++;
            }
        }
        return list;
    }
}