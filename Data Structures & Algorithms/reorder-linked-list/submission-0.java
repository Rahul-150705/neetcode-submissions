/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow1=head,fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow1=slow1.next;
            fast=fast.next.next;
        }
        ListNode slow=slow1.next;
        ListNode prev=slow1.next=null;
        while(slow!=null)
        {
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;

        }
        ListNode first=head;
        ListNode second=prev;
        while(second!=null)
        {
            ListNode temp1=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
    }
}
