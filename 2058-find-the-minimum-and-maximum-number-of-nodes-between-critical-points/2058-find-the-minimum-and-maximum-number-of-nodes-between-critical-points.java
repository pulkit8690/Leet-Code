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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = new int[]{-1, -1};
        if (head == null || head.next == null || head.next.next == null) {
            return arr;
        }
        
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nxt = curr.next;
        int i = 1;
        ArrayList<Integer> criticalPoints = new ArrayList<>();
        
        while (nxt != null) {
            if ((curr.val > prev.val && curr.val > nxt.val) || (curr.val < prev.val && curr.val < nxt.val)) {
                criticalPoints.add(i);
            }
            prev = curr;
            curr = nxt;
            nxt = nxt.next;
            i++;
        }
        
        if (criticalPoints.size() < 2) {
            return arr;
        }
        
        int minD = Integer.MAX_VALUE;
        int maxD = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);
        
        for (int j = 1; j < criticalPoints.size(); j++) {
            minD = Math.min(minD, criticalPoints.get(j) - criticalPoints.get(j - 1));
        }
        
        arr[0] = minD;
        arr[1] = maxD;
        return arr;
    }
}