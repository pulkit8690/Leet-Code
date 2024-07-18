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
    public int maxPathSum(TreeNode root) {
        int max_val[] = new int[1];
        max_val[0]=Integer.MIN_VALUE;
        helper(root,max_val);
        return max_val[0];
    }
    public int helper(TreeNode root, int max_val[])
    {
        if(root==null)
        {
            return 0;
        }
        int leftMax=Math.max(0,helper(root.left,max_val));
        int rightMax=Math.max(0,helper(root.right,max_val));
        max_val[0]= Math.max(max_val[0],leftMax+rightMax+root.val);
        return Math.max(leftMax,rightMax)+root.val;
    }
}