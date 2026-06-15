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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val>key)
        {
            root.left=deleteNode(root.left,key);
        }
        else if(root.val<key)
        {
            root.right=deleteNode(root.right,key);
        }
        else
        {
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else
            {
                TreeNode curr=root.right;  // we should replace it with right to not break the binary tree structure
                while(curr.left!=null)
                {
                    curr=curr.left;
                }
                // when we find the null
                root.val=curr.val;
                root.right=deleteNode(root.right,curr.val); // no duplicate after deleting key and replacing it with right value we should remove the right value 
            }
        }
        return root;
        
    }
}