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
 
    
    public int helper(TreeNode root,int maxValue) {
        if(root==null) return 0;
           int count=0;
        if(maxValue<=root.val){
            count=1;
            maxValue=root.val;
        }

       count+=helper(root.left,maxValue);
        count+=helper(root.right,maxValue);

        return count;

    }
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;

        return 1+helper(root.left,root.val)+ helper(root.right,root.val);

    }
}
