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
    boolean value = true;
    public boolean isBalanced(TreeNode root) {
        heightTree(root);
        return value;
    }
    public int heightTree(TreeNode root){
        if(root == null){
            return 0;
        }
        else{
            int height_left = heightTree(root.left);
            int height_right = heightTree(root.right);
            if(Math.abs(height_left - height_right)>1 && value){
                value = false;
            }
            return Math.max(height_left,height_right)+1;

        }
    }
}