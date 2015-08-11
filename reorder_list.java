/**
Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        ListNode runner1 = head,runner2 = head,previous=null;
        if(head==null)
            return;
        while(runner2!=null){
            if(runner2.next!=null){
                runner2 = runner2.next.next;
            }
            else{
                runner2 = runner2.next;
            }
            previous = runner1;
            runner1 = runner1.next;
        }
        previous.next=null;
        runner2 = reverse(runner1);
        runner1 = head;
        ListNode temp1,temp2;
        while(runner1!=null && runner2!=null){
            temp1 = runner1.next;
            runner1.next = runner2;
            temp2 = runner2.next;
            runner2.next = temp1;
            runner1 = temp1;
            runner2 = temp2;
            
        }
        
    }
    public ListNode reverse(ListNode head){
        ListNode previous=null,current=head,next=null;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}