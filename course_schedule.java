/*Course Schedule Total Accepted: 15762 Total Submissions: 70857 My Submissions Question Solution 
There are a total of n courses you have to take, labeled from 0 to n - 1.

Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?

For example:

2, [[1,0]]
There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.

2, [[1,0],[0,1]]
There are a total of 2 courses to take. To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.*/
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length==0)
            return true;
        int courses_with_prequistes_done = 0;
        int prerequistes_needed[] = new int[numCourses];
        Arrays.fill(prerequistes_needed,0);
        for(int i=0;i<prerequisites.length;i++){
            prerequistes_needed[prerequisites[i][0]]++;
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0;i<prerequistes_needed.length;i++){
            if(prerequistes_needed[i]==0)
                list.add(i);
        }
        courses_with_prequistes_done = list.size();
        while(list.size()!=0){
            int x = list.remove();
            for(int i=0;i<prerequisites.length;i++){
                if(prerequisites[i][1]==x){
                    prerequistes_needed[prerequisites[i][0]]--;
                if(prerequistes_needed[prerequisites[i][0]]==0){
                    list.add(prerequisites[i][0]);
                    courses_with_prequistes_done +=1;
                }
                }
                /*if(courses_with_prequistes_done==numCourses)
                    return true;*/
                
            }
        }
        return courses_with_prequistes_done==numCourses;
        
    }
}