import java.io.*;
import java.util.*;
class Solution {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int numbers = sc.nextInt();
        int[] n = new int[numbers];
        for(int i=0;i<n.length;i++){
            n[i] = sc.nextInt();
        }
        System.out.println(firstMissingPositive(n));
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        if(nums.length==0)
            return 1;
        if(nums.length==1){
            if(nums[0]<=0)
                return 1;
            if(nums[0]==1){
                return 2;
            }
        }
        int start = 1;
        for(i=0;i<nums.length;i++){
            if(nums[i]>0){
                nums[start] = nums[i];
                System.out.println(nums[start]+"start: "+start);
                start++;
            }
        }
        System.out.println("Value of start"+start);
        for(i=start;i<nums.length;i++){
            nums[i] = 0;
        }
        for(i=0;i<nums.length;i++){
            if(Math.abs(nums[i])!=0){
                if(Math.abs(nums[i])<nums.length && nums[Math.abs(nums[i])] < 0){
                    continue;
                }
                else{
                    if(Math.abs(nums[i])<nums.length)
                        if(nums[Math.abs(nums[i])]==0)
                            nums[Math.abs(nums[i])] = -1*nums.length;
                        else
                            nums[Math.abs(nums[i])] *= -1;
                }
            }
        }
        for(i=1;i<nums.length;i++){
            if(nums[i] >= 0){
                return i;
            }
        }
        if(nums[nums.length-1]==-1*nums.length){
            return nums.length+1;
        }
        return i;
    }
        
}