/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       return helper(root,p.val,q.val);
    }
    public TreeNode helper(TreeNode root,int p, int q)
    {
        if(root==null || root.val==p || root.val==q)
		{
		    return root;
		}
		TreeNode Left = helper(root.left,p,q);
		TreeNode Right=helper(root.right,p,q);
		if(Left==null)
		{
		    return Right;
		}
		if(Right==null)
		{
		    return Left;
		}
		return root;
    }
    }
