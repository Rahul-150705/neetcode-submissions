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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode slow=head;
        ListNode fast=head;
        int x=right-left;
        int y=right-left+1;
        ListNode prev=null;
        while(left>1)
        {
            prev=slow; //2
            slow=slow.next; 
            left--;
        }
        ListNode first=slow; //3
        while(x>=1)
        {
            slow=slow.next;
            x--;
        }
        ListNode last=slow.next; // 7
        ListNode v=last; // 7
        ListNode t=first; // 3
        while(y>0)
        {
            ListNode temp=t.next;
            t.next=v;
            v=t;
            t=temp;
            y--;
        }
        if(prev!=null)
        {
            prev.next=v;
        }
        else
        {
            head=v;
        }
        return head;
    }
}