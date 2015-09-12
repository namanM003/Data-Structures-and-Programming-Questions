
/*
Given a collection of numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
*/
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Integer[] array = new Integer[nums.length];
        int count=0;
        for(int i:nums){
            array[count] = (Integer)(i);
            count++;
        }
        //list.add(Arrays.asList(array));
        //for(int i=0;i<nums.length;i++)
          //  findpermutations(array,i,list);
        findpermutations(array,0,list);
        return list;
    }
    public void findpermutations(Integer[] nums,int index,List<List<Integer>> list){
        if(index>=nums.length){
        List<Integer> arraylist = Arrays.asList(nums);
        //if(!list.contains(arraylist))
            list.add(new ArrayList<Integer>(arraylist));
        }
        for(int i=index;i<nums.length;i++){
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
            findpermutations(nums,index+1,list);
            //   list.add(arraylist);
            temp = nums[i];
            nums[i] = nums[index];
            nums[index]=temp;
            
        }
    }
}