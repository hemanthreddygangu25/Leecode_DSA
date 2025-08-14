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
    private void inorder(TreeNode root , ArrayList<Integer> x)
    {
        if(root==null) 
        {
            return;
        }
        else
        {
            inorder(root.left,x);
            x.add(root.val);
            inorder(root.right,x);
        }

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> x=new ArrayList<>();
        inorder(root,x);
        int[] y=new int[x.size()];
        for(int i=0;i<x.size();i++)
        {
            y[i]=x.get(i);

        }
        return x;
        
    }
}