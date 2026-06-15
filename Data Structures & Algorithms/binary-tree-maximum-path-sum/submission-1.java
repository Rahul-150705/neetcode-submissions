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
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }
    private int dfs(TreeNode root)
    {
        if(root==null) return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        int leftmax=Math.max(left,0);
        int rightmax=Math.max(right,0);
        res=Math.max(res,root.val+leftmax+rightmax);
        return root.val+Math.max(leftmax,rightmax);
    }
}
