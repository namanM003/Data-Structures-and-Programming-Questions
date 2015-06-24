/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) { val = x; }

 * }

 */

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;

        ListNode tmp1,tmp2,tmp=null;

        tmp1 = l1;

        tmp2 = l2;

        boolean carry = false;

        int x = 0;

        while(tmp1!=null && tmp2!=null){

            if(carry){

                x = tmp1.val+tmp2.val+1;

            }

            else{

                x = tmp1.val + tmp2.val;

            }

            if(x>=10){

                carry = true;

            }

            else{

                carry = false;

            }

            if(head == null){

                

                if(carry){

                    head = new ListNode(x%10);

                }

                else{

                    head = new ListNode(x);

                }

                tmp=head;

            }

            else{

                ListNode node;

                if(carry){

                    node = new ListNode(x%10);

                }

                else{

                    node = new ListNode(x);

                }

                tmp.next = node;

                tmp = node;

            }

            tmp1 = tmp1.next;

            tmp2 = tmp2.next;

        }

        while(tmp1!=null || tmp2!=null){

            ListNode node;

            if(carry){

                if(tmp1!=null){

                    x = tmp1.val+1;

                    tmp1 = tmp1.next;

                }

                else{

                    x = tmp2.val +1;

                    tmp2 = tmp2.next;

                }

            }

            else{

                if(tmp1!=null){

                    x = tmp1.val;

                    tmp1 = tmp1.next;

                }

                else{

                    x = tmp2.val;

                    tmp2 = tmp2.next;

                }

            }

            if(x>=10){

                carry = true;

            }

            else{

                carry = false;

            }

            if(carry){

                node = new ListNode(x%10);

            }

            else{

                node = new ListNode(x);

            }

            tmp.next = node;

            tmp = node;

        }

        if(carry){

            ListNode node = new ListNode(1);

            tmp.next = node;

        }

     return head;

    }

}
