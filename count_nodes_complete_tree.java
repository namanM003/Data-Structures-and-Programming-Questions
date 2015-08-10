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

    public int countNodes(TreeNode root) {

        if(root==null){

            return 0;

        }

        int left = heightleft(root);

        int right = heightright(root);

        if(left==right){

            return (1<<left)-1;

        }

        else{

            return countNodes(root.left)+countNodes(root.right)+1;

        }

        

    }

    

    

    public int heightleft(TreeNode root){

        if(root==null){

            return 0;

        }

        return heightleft(root.left)+1;

    }

    

    

    public int heightright(TreeNode root){

        if(root==null){

            return 0;

        }

        return heightright(root.right)+1;

    }

}
