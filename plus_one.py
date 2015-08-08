'''
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
'''
class Solution:
    # @param {integer[]} digits
    # @return {integer[]}
    def plusOne(self, digits):
        if len(digits)==0:
            return [1]
        carry = False
        for i in range(len(digits)-1,-1,-1):
            if digits[i] == 9 and i == 0:
                digits[i] = 0
                a = 1
                digits = [a] + digits
                return digits
            if digits[i] == 9:
                digits[i] = 0
                carry = True
                continue
            if digits[i] < 9:
                digits[i] = digits[i]+1
                carry = False
                return digits