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
        List<TreeNode> path1= new ArrayList<>();
        List<TreeNode> path2= new ArrayList<>();
        getPath(root,p.val,path1);
        getPath(root,q.val,path2);
        int i=0;
        for(;i<path1.size() && i<path2.size();i++)
        {
            if(path1.get(i)!=path2.get(i))
            {
                break;
            }
        }
        TreeNode lca = path1.get(i-1);
        return lca;
    }
    public boolean getPath(TreeNode root, int n,List<TreeNode> path)
    {
        if(root==null)
        {
            return false;
        }
        path.add(root);
        if(root.val==n)
        {
            return true;
        }
        boolean foundleft=getPath(root.left,n,path);
        boolean foundright=getPath(root.right,n,path);
        if(foundleft || foundright)
        {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}