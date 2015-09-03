/*Given an array of integers, find out whether there are two distinct indices i and j in the array such that the 
difference between nums[i] and nums[j] is at most t and the difference between i and j is at most k.
*/
public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums.length==0)
            return false;
        //int left = -1;
        if(k<=0 || t<0)
            return false;
        SortedSet<Long> ts = new TreeSet<Long>();
        SortedSet<Long> subs;
        long left=0,right=0;
        for(int i=0;i<nums.length;i++){
          left = (long)nums[i] - (long)t;
          right = (long)nums[i]+(long)t+1;
          subs = ts.subSet(left,right);
          if(!subs.isEmpty()){
              return true;
          }
          ts.add((long)nums[i]);
          if(i>=k)
            ts.remove((long)nums[i-k]);
          
        }
        return false;
    }
}