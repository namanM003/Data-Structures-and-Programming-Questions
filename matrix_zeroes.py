'''
Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
'''
class Solution:
    # @param {integer[][]} matrix
    # @return {void} Do not return anything, modify matrix in-place instead.
    def setZeroes(self, matrix):
        row = list()
        colums = list()
        
        for i in range(0,len(matrix)):
            for j in range(0,len(matrix[0])):
                if(matrix[i][j]==0):
                    row.append(i)
                    colums.append(j)
        for ro in row:
            for j in range(0,len(matrix[0])):
                matrix[ro][j] = 0
        for co in colums:
            for j in range(0,len(matrix)):
                matrix[j][co] = 0