public class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0)
            return -1;
        int pivot = find_pivot(nums,0,nums.length-1);
        if(nums[pivot]==target)
            return pivot;
        if((pivot!=0 && nums[pivot-1]>=target) && nums[0] <=target)
            return binarysearch(nums,0,pivot-1,target);
        else
            return binarysearch(nums,pivot+1,nums.length-1,target);
    }
    public int binarysearch(int[] nums,int low,int high,int target){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(nums[mid]==target)
            return mid;
        if(nums[mid]>target)
            return binarysearch(nums,low,mid-1,target);
        else
            return binarysearch(nums,mid+1,high,target);
    }
    public int find_pivot(int[] nums,int low,int high){
        
        int mid = (low+high)/2;
        if(mid == nums.length-1)
            return mid;
        if(mid == 0)
            return mid;
        if(mid>0 && nums[mid]<nums[mid-1] && mid<nums.length-1 && nums[mid]<nums[mid+1])
            return mid;
        else{
            if(nums[high]>nums[mid])
                return find_pivot(nums,low,mid-1);
            else
                return find_pivot(nums,mid+1,high);
                /*else{
                    if(nums[mid]<nums[low] && nums[mid] > nums[mid-1])
                        return find_pivot(nums,low,mid-1)
                }*/
        }
    }
}