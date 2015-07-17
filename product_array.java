/*Product of Array Except Self*/
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int left=1;
        int right = 1;
        int right_pointer = nums.length-1;
        int[] output_array = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            output_array[i]=1;
        }
        for(int i=0;i<nums.length;i++){
           left = left*nums[i];
           right = right * nums[nums.length-1-i];
           if(i+1<nums.length){
               output_array[i+1] *= left; 
           }
           if(right_pointer>0)
            output_array[--right_pointer] *= right;
        }
        return output_array;
    }
}