/*
Given a set of distinct integers, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,3], a solution is:*/
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        findsubsets(nums,list,new ArrayList<Integer>(),0);
       // if(nums.length==0)
         //   return list;
        //list.add(new ArrayList<Integer>());
        return list;
    }
    public void findsubsets(int[] nums,List<List<Integer>> list,ArrayList<Integer> arraylist,int index){
        if(!list.contains(arraylist)){
            list.add(new ArrayList<Integer>(arraylist));
        }
        if(index==nums.length)
            return;
        findsubsets(nums,list,new ArrayList<Integer>(arraylist),index+1);
        arraylist.add(nums[index]);
        findsubsets(nums,list,arraylist,index+1);
    }
}