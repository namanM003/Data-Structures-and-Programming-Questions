/**Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        //TreeNode root;
        ListNode runner1 = head;
        ListNode runner2 = head;
        ListNode previous = null;
        while(runner2!=null){
            if(runner2.next!=null){
                runner2 = runner2.next.next;
                
            }
            else{
                runner2  = runner2.next;
                break;
            }
            previous = runner1;
            runner1 = runner1.next;
        }
        if(runner1==head){
            return new TreeNode(head.val);
        }
        previous.next = null;
        TreeNode root = new TreeNode(head.val);
        root.left = null;
        root.right = null;
        ListNode temp = runner1.next;
        runner1.next = null;
        
        root.val = runner1.val;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(temp);
        return root;
    }
    
}