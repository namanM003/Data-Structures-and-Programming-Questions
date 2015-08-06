'''
Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

For example,
Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.

Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Therefore, return the max sliding window as [3,3,5,5,6,7].
'''
class Solution:
    # @param {integer[]} nums
    # @param {integer} k
    # @return {integer[]}
    def maxSlidingWindow(self, nums, k):
        max_array = list()
        if(len(nums)==0):
            return max_array
        index = 0
        max_number = -sys.maxint - 1
        left = 0
        for i in range(k):
            if(nums[i] > max_number):
                max_number = nums[i]
                index = i
        max_array.append(max_number)
        for i in range(k,len(nums)):
            left = left + 1
            if(left>index):
                max_number = -sys.maxint - 1
                for j in range(left,i):
                    if(nums[j] > max_number):
                        max_number = nums[j]
                        index = j
            if(nums[i] > max_number):
                max_number = nums[i]
                index = i
            max_array.append(max_number)
        return max_array
                    
            