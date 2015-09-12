/**
Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root==null)
            return list;
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        stack1.add(root);
        List<Integer> arraylist = new ArrayList<Integer>();
        TreeNode temp;
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            arraylist = new ArrayList<Integer>();
            while(!stack1.isEmpty()){
                temp = stack1.pop();
                arraylist.add(temp.val);
                if(temp.left!=null){
                    stack2.push(temp.left);
                }
                if(temp.right!=null){
                    stack2.push(temp.right);
                }
            }
            list.add(arraylist);
            arraylist = new ArrayList<Integer>();
            while(!stack2.isEmpty()){
                temp = stack2.pop();
                arraylist.add(temp.val);
                if(temp.right!=null)
                    stack1.push(temp.right);
                if(temp.left!=null)
                    stack1.push(temp.left);
            }
            if(arraylist.size()!=0)
                list.add(arraylist);
        }
        return list;
    }
}