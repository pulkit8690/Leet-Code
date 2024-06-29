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
    public ListNode swapNodes(ListNode head, int k) {
        int size=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        ListNode temp1=head;
        int i=1;
        while(i<k)
        {
            temp1=temp1.next;
            i++;
        }
        ListNode temp2=head;
        int j=0;
        while(j<size-k)
        {
            temp2=temp2.next;
            j++;
        }
        int ans=temp1.val;
        temp1.val=temp2.val;
        temp2.val=ans;
        return head;
    }
}