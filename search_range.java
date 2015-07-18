/*Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4]. */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] values = new int[2];
        values[0] = Integer.MAX_VALUE;
        values[1] = Integer.MIN_VALUE;
        
        if(nums.length == 0){
            values[0] = -1;
            values[1] = -1;
            return values;
        }
        values = searchrange(nums,target,0,nums.length-1,values);
        return values;
    }
    public int[] searchrange(int[] nums,int target,int low,int high,int[] values){
        int mid = (high+low)/2;
        //int[] values = new int
        if(nums[mid]==target){
            values[0]= findstart(nums,target,low,mid);
            values[1] = findend(nums,target,mid,high);
            return values;
        }
        if(high<low){
            values[0] = -1;
            values[1] = -1;
            return values;
        }
        if(nums[mid]>target){
            return searchrange(nums,target,low,mid-1,values);
        }
        else{
            return searchrange(nums,target,mid+1,high,values);
        }
    }
    public int findstart(int[] nums,int target,int low,int high){
        int mid = (high+low)/2;
        if(nums[mid] == target){
                if(mid-1>= 0 && nums[mid-1]!=target)
                    return mid;
                else{
                    if(mid-1<0){
                        return mid;
                    }
                }
        }
        if(nums[mid]>=target){
            return findstart(nums,target,low,mid-1);
        }
        else{
            return findstart(nums,target,mid+1,high);
        }
    }
        public int findend(int[] nums,int target,int low,int high){
        int mid = (high+low)/2;
        if(nums[mid] == target){
                if(mid+1<nums.length && nums[mid+1]!=target)
                    return mid;
                else{
                    if(mid+1==nums.length){
                        return mid;
                    }
                }
        }
        if(nums[mid]>target){
            return findend(nums,target,low,mid-1);
        }
        else{
            return findend(nums,target,mid+1,high);
        }
    }
}