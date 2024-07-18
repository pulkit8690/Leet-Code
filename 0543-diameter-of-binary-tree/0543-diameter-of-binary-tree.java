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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int leftdia=diameterOfBinaryTree(root.left);
        int leftH= Height(root.left);
        int rightdia=diameterOfBinaryTree(root.right);
        int rightH= Height(root.right);
        int selfdia= leftH+rightH;
        return Math.max(selfdia,Math.max(leftdia,rightdia));
    }
    public int Height(TreeNode root){
        if(root==null)
        {
            return 0;
        }
        int lH=Height(root.left);
        int rH=Height(root.right);
        return Math.max(lH,rH)+1;
    }
}