/*Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.*/

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = -1;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<k && i<nums.length;i++){
            if(!hs.contains(nums[i]))
                hs.add(nums[i]);
            else
                return true;
        }
        for(int i=k;i<nums.length;i++){
            if(left>=0)
                hs.remove(nums[left]);
            left++;
            if(hs.contains(nums[i]))
                return true;
            hs.add(nums[i]);
        }
        return false;
        
    }
}