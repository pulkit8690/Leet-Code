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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> mainList = new ArrayList<>();
        if(root==null)
        {
            return mainList;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> subList = new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode currNode = q.remove();
            if(currNode==null)
            {
                mainList.add(subList);
                subList = new ArrayList<>();
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                subList.add(currNode.val);
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }
           
        }
        return mainList;
    }
}