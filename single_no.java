/* Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:

    The order of the result is not important. So in the above example, [5, 3] is also correct.
    Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
*/
public class Solution {
    public int[] singleNumber(int[] nums) {
        int left= 0, right = nums.length-1;
        int xor = 0;
        for(int i: nums){
            xor  = xor^i;
        }
        int temp = 0;
        int x= xor & (~(xor-1));
        //System.out.println(x);
        int z = 0;
        for(int i=0;i<=right;i++){
            if((z=nums[i]&x)==x){
                nums[left] = nums[i];
                left++;
            }
            else{
                temp = nums[right];
                nums[right] = nums[i];
                right--;
                nums[i] = temp;
                i--;
            }
        }
        int[] array = new int[2];
        Arrays.fill(array,0);
        /*for(int i=0;i<nums.length;i++){
            System.out.print(""+nums[i]+" ");
        }*/
        for(int i=0;i<left;i++){
            array[0] = array[0]^nums[i];
        }
        for(int i=left;i<=nums.length-1;i++){
            array[1] = array[1]^nums[i];
        }
        return array;
    }
}