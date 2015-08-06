'''
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
'''
class Solution:
    # @param {character[][]} board
    # @return {boolean}
    def isValidSudoku(self, board):
        values = [False] * 10
        for row in range(0,9,3):
            for column in range(0,9,3):
                values = [False] * 10;
                for block_row in range(0,3):
                    for block_column in range(0,3):
                        if(board[row+block_row][column+block_column]!='.'):
                            if(values[int(board[row+block_row][column+block_column])]):
                                return False
                            else:
                                values[int(board[row+block_row][column+block_column])] = True;
                #column = column + 3
            #row = row + 3
        for row in range(0,len(board)):
            values = [False] * 10
            for column in range(0,len(board[0])):
                if(board[row][column]!='.'):
                    if(values[int(board[row][column])]):
                        return False
                    else:
                        values[int(board[row][column])] = True
                        
        for column in range(0,len(board[0])):
            values = [False] * 10
            for row in range(0,len(board)):
                if(board[row][column]!='.'):
                    if(values[int(board[row][column])]):
                        return False
                    else:
                        values[int(board[row][column])] = True
        return True