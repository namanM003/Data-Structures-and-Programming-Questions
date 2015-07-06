public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int[][] numbers = new int[3][2];
        int count_required = (int)Math.floor((nums.length/3));
        boolean flag = false;
        for(int j=0;j<3;j++){
            numbers[j][0] = j;
            numbers[j][1] = 0;
        }
        for(int i=0;i<nums.length;i++){
            flag = false;
            for(int j=0;j<numbers.length;j++){
                if(nums[i]==numbers[j][0]){
                    numbers[j][1]++;
                    flag = true;
                }
            }
            if(!flag){
                boolean flag_to_check_number_inserted = false;
                for(int j=0;j<numbers.length;j++){
                    if(numbers[j][1]==0){
                        numbers[j][0]=nums[i];
                        numbers[j][1]=1;
                        flag_to_check_number_inserted = true;
                        break;
                    }
                }
                if(!flag_to_check_number_inserted){
                    for(int j=0;j<numbers.length;j++){
                        numbers[j][1]--;
                    }
                }
            }
        }
        List<Integer> arr=new ArrayList<Integer>();
        if(nums.length == 0){
            return arr;
        }
        for(int j=0;j<numbers.length;j++){
            int count = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==numbers[j][0]){
                    count++;
                }
            }
            if(count>count_required){
                arr.add(numbers[j][0]);
            }
        }
        return arr;
    }
}