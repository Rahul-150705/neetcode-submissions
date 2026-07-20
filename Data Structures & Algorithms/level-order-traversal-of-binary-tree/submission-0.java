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
        List<List<Integer>> list=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
        {
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer> temp=new LinkedList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=queue.poll();
                temp.add(curr.val);
                if(curr.left!=null)
                {
                    queue.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    queue.offer(curr.right);
                }
            }
            list.add(temp);
        }
        return list;
    }
}
