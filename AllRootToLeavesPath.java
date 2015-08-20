/**Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if(root==null){
            return list;
        }
        
        findpaths(root,list,"");
        
        return list;
        
    }
    public void findpaths(TreeNode root,List<String> list,String str){
        if(str==""){
            str = ""+root.val;
        }
        else{
            str = str+"->"+(""+root.val);
        }
        if(root.left==null && root.right==null){
            //str = str+(""+root.val);
            list.add(str);
            return;        }
        
        
        if(root.left!=null)
            findpaths(root.left,list,str);
        if(root.right!=null)
            findpaths(root.right,list,str);
        return;
        
    }
}