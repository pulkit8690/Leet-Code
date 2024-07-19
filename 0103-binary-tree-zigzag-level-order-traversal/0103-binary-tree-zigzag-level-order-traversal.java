/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> mainList = new ArrayList<>();
        boolean ltoR = true;
        q.add(root);
        
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> subList = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.remove();
                subList.add(curr.val);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            
            if (!ltoR) {
                Collections.reverse(subList);
            }
            mainList.add(subList);
            ltoR = !ltoR;
        }
        
        return mainList;
    }
}