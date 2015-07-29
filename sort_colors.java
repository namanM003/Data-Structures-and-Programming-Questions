public class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        for(int i=0;i<=right;i++){
            if(nums[i]==0){
                nums[left] = 0;
                left++;
                continue;
            }
            if(nums[i]==2){
                nums[i] = nums[right];
                if(i!=right)
                    i--;
                nums[right] = 2;
                right--;
                continue;
            }
        }
        while(left<=right){
            nums[left] = 1;
            left++;
        }
    }
}