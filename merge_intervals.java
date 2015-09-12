/**
Given a collection of intervals, merge all overlapping intervals.

For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
 class compare implements Comparator{
     public int compare(Object o1,Object o2){
         Interval i1 = (Interval)o1;
         Interval i2 = (Interval)o2;
         return i1.start - i2.start;
     }
 }
public class Solution {
    /*public int compare(Interval i1, Interval i2){
        return i1.start-i2.start;
    }*/
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size()==0){
            return new ArrayList<Interval>();
        }
        Collections.sort(intervals, new compare());
        Stack<Interval> stack = new Stack<Interval>();
        List<Interval> list = new ArrayList<Interval>();
        for(Interval i:intervals){
            if(stack.isEmpty()){
                stack.push(i);
            }
            else{
                Interval x = stack.peek();
                if(x.end>=i.start){
                    stack.pop();
                    if(x.end<i.end)
                        x.end = i.end;
                    stack.push(x);
                }
                else{
                    list.add(stack.pop());
                    stack.push(i);
                }
            }
        }
        if(stack.isEmpty()){
            return list;
        }
        else{
            list.add(stack.pop());
            return list;
        }
    }
}