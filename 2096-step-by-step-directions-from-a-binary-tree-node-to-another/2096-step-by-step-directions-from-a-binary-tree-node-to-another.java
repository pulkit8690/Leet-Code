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
    public TreeNode lca(TreeNode root , int n1 , int n2 )
    {
        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();
        getPath(root, n1,path1);
        getPath(root, n2,path2);
        int i=0;
        for(;i<path1.size() && i<path2.size();i++)
        {
            if(path1.get(i)!=path2.get(i))
            {
                break;
            }
        }
        TreeNode lcaNode = path1.get(i-1);
        return lcaNode;
    }
    public boolean getPath(TreeNode root , int n,List<TreeNode> path )
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
        boolean foundleft= getPath(root.left,n,path);
        boolean foundright= getPath(root.right,n,path);
        if(foundleft || foundright )
        {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public boolean findPath(TreeNode root , int n,StringBuilder path )
    {
        if(root==null)
        {
            return false;
        }
        if(root.val==n)
        {
            return true;
        }
        path.append("L");
        boolean foundleft = findPath(root.left, n, path);
        if (foundleft) {
        return true;
        }
        path.deleteCharAt(path.length() - 1);
        path.append("R");
        boolean foundright = findPath(root.right, n, path);
        if (foundright) {
        return true;
        }
         path.deleteCharAt(path.length() - 1);
    
        return false;
    }
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode L = lca(root,startValue,destValue);
        StringBuilder StoL = new StringBuilder();
        StringBuilder LtoD = new StringBuilder();
        findPath(L,startValue,StoL);
        findPath(L,destValue,LtoD);
        StringBuilder res = new StringBuilder();
        for(int i=0;i<StoL.length();i++)
        {
            res.append("U");
        }
        res.append(LtoD);
        return res.toString();
    }
}