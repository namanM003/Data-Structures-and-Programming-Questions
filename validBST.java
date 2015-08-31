/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean left = checkvalid(root.left,Long.MIN_VALUE,root.val);
        boolean right = checkvalid(root.right,root.val,Long.MAX_VALUE);
        return left & right;
    }
    public boolean checkvalid(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.val <= min || root.val >= max){
            return false;
        }
        else{
            return checkvalid(root.left,min,root.val) & checkvalid(root.right,root.val,max);
        }
    }
        
}