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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
    private int dfs(TreeNode root,int max)
    {
        if(root==null) return 0;
        int res;
        if(root.val>=max)
        {
            max=root.val;
            res=1;
        }
        else
        {
            res=0;
        }
        res+=dfs(root.left,max);
        res+=dfs(root.right,max);
        return res;
    }
}
