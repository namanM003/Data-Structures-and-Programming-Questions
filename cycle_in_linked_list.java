/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode runner = head;
        ListNode runner2 = head.next;
        while(runner2!=null){
            if(runner2.next!=null){
                runner2 = runner2.next.next;
                
            }
            else{
                runner2 = runner2.next;
            }
            runner = runner.next;
            if(runner2 == runner){
                return true;
            }
            if(runner2==null){
                return false;
            }
        }
        return false;
    }
}