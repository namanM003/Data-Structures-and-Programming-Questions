/*
Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
*/
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //int x = 0;
        if(triangle.size()==0){
            return 0;
        }
        List<Integer> start = triangle.get(0);
        List<Integer> runner;
        //int x = start.get(0);
        for(int i=1;i<triangle.size();i++){
            runner = triangle.get(i);
            for(int j=0;j<runner.size();j++){
                if(j==0 || j==runner.size()-1){
                    if(j==0)
                        runner.set(0, runner.get(j)+start.get(0));
                    else
                        runner.set(runner.size()-1,runner.get(j)+start.get(start.size()-1));
                }
                else{
                    runner.set(j,Math.min(runner.get(j)+start.get(j-1),runner.get(j)+start.get(j)));
                }
            }
            start = runner;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<start.size();i++){
            if(start.get(i)<min){
                min = start.get(i);
            }
        }
        return min;
    }
}