 /*Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"]. */
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> arr = new ArrayList<String>();
        int start=0,end;
        boolean flag = false;
        if(nums.length==0){
            return arr;
        }
        if(nums.length < 2){
            String s = ""+nums[0];
            arr.add(s);
            return arr;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i]-1 && flag){
                continue;
            }
            else{
                if(!flag && nums[i-1]==nums[i]-1){
                    start = nums[i-1];
                    flag = true;
                    continue;
                }
                else{
                    if(!flag && nums[i-1]!=nums[i]-1){
                            String s = ""+nums[i-1];
                            arr.add(s);
                            continue;
                    }
                    end = nums[i-1];
                    flag = false;
                    String s = "";
                    if(end ==  start){
                        s = ""+start;
                        arr.add(s);
                    }
                    else{
                        s = ""+start+"->"+""+end;
                        arr.add(s);
                    }
                }
            }
        }
        if(flag){
            String s = ""+start+"->"+nums[nums.length-1];
            arr.add(s);
        }
        if(nums[nums.length-1]!=nums[nums.length-2]+1){
            String s = ""+nums[nums.length-1];
            arr.add(s);
            
        }
        return arr;
    }
}