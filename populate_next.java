/*Given a binary tree

    struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

You may only use constant extra space.
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).*/
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }
        root.next = null;
        connect_nodes(root,null);
    }
    public void connect_nodes(TreeLinkNode root,TreeLinkNode root1){
        if(root==null){
            return;
        }
        if(root.left==null){
            return;
        }
        root.left.next = root.right;
        if(root1!=null){
            root.right.next = root1.left;
            root1.left.next = root1.right;
        }
        connect_nodes(root.left,root.right);
        if(root1!=null){
            connect_nodes(root.right,root1.left);
            connect_nodes(root1.left,root1.right);
        }
        else{
            connect_nodes(root.right,root1);
        }
            
        
    }
}