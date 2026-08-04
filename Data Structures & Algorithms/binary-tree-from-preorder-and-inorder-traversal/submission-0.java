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
    public TreeNode createTree(int [] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd,HashMap<Integer,Integer>hash){

        if(preEnd<preStart || inEnd<inStart) return null;
        int rootVal=preorder[preStart];
        TreeNode root=new TreeNode(rootVal);
        int index=hash.get(rootVal);

        int len=index-inStart;

        root.left=createTree(preorder,preStart+1,preStart+len,inorder,inStart,index-1,hash);
        root.right=createTree(preorder,preStart+len+1,preEnd,inorder,index+1,inEnd,hash);

        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>hash=new HashMap<>();
        int n=preorder.length;
        for(int i=0;i<n;i++){
             hash.put(inorder[i],i);
        }
        return createTree(preorder,0,n-1,inorder,0,n-1,hash);

    }
}
