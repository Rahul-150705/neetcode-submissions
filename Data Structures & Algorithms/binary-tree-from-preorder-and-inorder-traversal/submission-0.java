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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root=construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    private TreeNode construct(int[] preorder,int prestart,int preend,int[] inorder,int instart,int inend,HashMap<Integer,Integer>map)
    {
        if(prestart>preend|| instart>inend) return null;
        TreeNode root=new TreeNode(preorder[prestart]);
        int start=map.get(root.val);
        int numsleft=start-instart;
        root.left=construct(preorder,prestart+1,prestart+numsleft,inorder,instart,start-1,map);
        root.right=construct(preorder,prestart+numsleft+1,preend,inorder,start+1,inend,map);
        return root;
    }
}
