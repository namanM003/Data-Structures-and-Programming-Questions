/*Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

For example,
If n = 4 and k = 2, a solution is:

[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]*/
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        findcombinations(n,1,0,list,new ArrayList(),k);
        return list;
    }
    public void findcombinations(int n,int current,int size,List<List<Integer>> list, ArrayList<Integer> arraylist,int k){
        if(size==k){
            list.add(new ArrayList<Integer>(arraylist));
            return;
        }
        if(size>k || current>n)
            return;
        findcombinations(n,current+1,size,list,new ArrayList<Integer>(arraylist),k);
        arraylist.add(current);
        findcombinations(n,current+1,size+1,list,arraylist,k);
    }
}