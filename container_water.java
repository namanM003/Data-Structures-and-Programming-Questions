/*Container With Most Water 

Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water. */
public class Solution {
    public int maxArea(int[] height) {
        if(height.length==0){
            return 0;
        }
        int left = 0;
        int right  = height.length-1;
        int max = 0;
        int area = 0;
        while(left<right){
            area = (right-left)*Math.min(height[right],height[left]);
            if(area > max)
                max = area;
            if(Math.min(height[right],height[left])==height[right])
                right--;
            else
                left++;
        }
        return max;
        
    }
}