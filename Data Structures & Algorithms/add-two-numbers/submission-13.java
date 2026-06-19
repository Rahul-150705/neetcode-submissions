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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode dummy=new ListNode(0);
        ListNode node=dummy;
        while((l1!=null || l2!=null) || carry!=0)
        {
            int v1=(l1==null) ? 0 :l1.val;
            int v2=(l2==null) ? 0 :l2.val; 
            int x=v1+v2+carry;
            int z=x%10;
            carry=x/10;
            node.next=new ListNode(z);
            node=node.next;
            if (l1 != null) {
            l1 = l1.next;
        } else {
            l1 = null;
        }

        if (l2 != null) {
            l2 = l2.next;
        } else {
            l2 = null;
        }
        }
        return dummy.next;
    }
}
