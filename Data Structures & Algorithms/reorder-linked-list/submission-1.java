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
        ListNode curr1=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow.next;
        slow.next = null;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        ListNode curr2=prev;
        while(curr2!=null)        
        {
            ListNode temp1=curr1.next;
            ListNode temp2=curr2.next;
            curr1.next=curr2;
            curr2.next=temp1;
            curr1=temp1;
            curr2=temp2;
        }
    }
}
