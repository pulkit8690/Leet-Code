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
    public boolean isBalanced(TreeNode root) {
        if(Height(root)!=-1)
        {
            return true;
        }
        return false;
    }
    public int Height(TreeNode root){
        if(root==null)
        {
            return 0;
        }
        int leftH=Height(root.left);
        if(leftH==-1) return -1;
        int rightH=Height(root.right);
        if(rightH==-1)return -1;
        if(Math.abs(leftH-rightH)>1) return -1;
        return Math.max(leftH,rightH)+1;
    }
}