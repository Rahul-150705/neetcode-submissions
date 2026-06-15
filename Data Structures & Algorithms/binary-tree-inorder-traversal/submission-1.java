/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        return list;
    }
    private void inorder(TreeNode curr,List<Integer> list)
    {
        if(curr==null) return;
        inorder(curr.left,list);
        list.add(curr.val);
        inorder(curr.right,list);
    }
}