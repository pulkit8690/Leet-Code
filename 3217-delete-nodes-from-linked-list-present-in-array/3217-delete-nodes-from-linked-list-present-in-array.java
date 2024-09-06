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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> s= new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr= head;
        ListNode temp=dummy;
        while(curr!=null)
        {
            if(!s.contains(curr.val))
            {
                temp.next=curr;
                temp=temp.next;
            }
            curr=curr.next;
        }
        temp.next = null;
        return dummy.next;
    }
}