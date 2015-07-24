/*Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---

You should return [1, 3, 4]*/
public class Solution {
    int max_level = -1;
    public List<Integer> rightSideView(TreeNode root) {
        int level = 0;
        
        return rightView(root,0,new ArrayList());
    }
    public List<Integer> rightView(TreeNode root,int level,ArrayList<Integer> arr){
        if(root == null){
            return arr;
        }
        if(level > max_level){
            max_level = level;
            arr.add(root.val);
        }
        rightView(root.right,level+1,arr);
        rightView(root.left,level+1,arr);
        return arr;
    }
}