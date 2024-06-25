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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
        {
            return null;
        }
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            temp=temp.next;
            n++;
        }
        int i=1;
        ListNode prev=head;
        while(i<(n/2))
        {
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return head;
    }
}