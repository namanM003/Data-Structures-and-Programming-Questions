/*Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 →*/
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0)
            return 0;
        int x = binarysearch(nums,target,0,nums.length-1);
        return x;
    }
    public int binarysearch(int[] nums,int target,int low, int high){
        int mid = (high+low)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(high < low){
            if(high >= 0 && nums[high] < target){
                return high+1;
            }
            else
                return low;
        }
        if(nums[mid]>target){
            return binarysearch(nums,target,low,mid-1);
        }
        else{
            return binarysearch(nums,target,mid+1,high);
        }
    }
}