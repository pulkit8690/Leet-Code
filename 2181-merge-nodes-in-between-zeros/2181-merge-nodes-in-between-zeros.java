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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        while(temp!=null)
        {
            ListNode curr= temp;
            int sum=0;
            while(curr.val >0)
            {
                sum=sum+curr.val;
                curr=curr.next;
            }
            temp.val=sum;
            temp.next=curr.next;
            temp=curr.next;
        }
        return head.next;
    }
}