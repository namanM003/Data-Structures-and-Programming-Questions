c class Solution {

    int min;

    static int INT_MAX = 2147483647;

    public int threeSumClosest(int[] nums, int target) {

        if(nums.length<3){

            return 0;

        }

        Arrays.sort(nums);

        int min=INT_MAX;

        int targety=0;

        int left=0,right=nums.length;

        for(int i=0;i<nums.length;i++){

            int right_pointer = nums.length-1;

            int variable_pointer = i+1;

            while(variable_pointer < right_pointer){

                int sum = nums[i]+nums[right_pointer]+nums[variable_pointer];

                if(sum-target==0){

                    return sum;

                }

                if(min>Math.abs(sum-target)){

                    min = Math.abs(sum-target);

                    targety=sum;

                }

                if(sum>target){

                    right_pointer--;

                }

                if(sum<target){

                    variable_pointer++;

                }

                

            }

        }

        return targety;

    }

     

    

}
