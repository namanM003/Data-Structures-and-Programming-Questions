'''
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:
Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
The solution set must not contain duplicate quadruplets.
    For example, given array S = {1 0 -1 0 -2 2}, and target = 0.

    A solution set is:
    (-1,  0, 0, 1)
    (-2, -1, 1, 2)
    (-2,  0, 0, 2)
'''
class Solution:
    # @param {integer[]} nums
    # @param {integer} target
    # @return {integer[][]}
    def fourSum(self, nums, target):
        nums.sort()
        lists = []
        for i in range(len(nums)-3):
            if nums[i]>target:
                if target < 0 and nums[i] > 0:
                    return lists
                else:
                    if target>0:
                        return lists
            for j in range(i+1,len(nums)-2):
                left = j+1
                right = len(nums)-1
                if nums[i]+nums[j] > target:
                    if target<0 and nums[j]>0:
                        break
                    
                while left<right:
                    if nums[i]+nums[j]+nums[left]+nums[right]==target:
                        x = [nums[i],nums[j],nums[left],nums[right]]
                        if not (x in lists):
                            lists.append(x)
                        left = left+1
                        #x.append(nums[i]
                    else:
                        if nums[i]+nums[j]+nums[left]+nums[right]>target:
                            right = right-1
                        else:
                            left = left+1
        return lists