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
 List<List<Integer>>ans= new ArrayList<>(); 
        if(root==null) return ans;
        Queue<Pair<TreeNode,Integer>>q=new LinkedList<>();

        q.offer(new Pair<>(root,0));
       
        while(!q.isEmpty()){
            int size=q.size();
            
            List<Integer>temp=new ArrayList<>();

            for(int i=0;i<size;i++){
                Pair<TreeNode,Integer>top=q.poll();
                TreeNode node=top.getKey();
                int level=top.getValue();
                temp.add(node.val);

                if(node.left!=null){
                    q.offer(new Pair<>(node.left,level+1));
                }
                 if(node.right!=null){
                    q.offer(new Pair<>(node.right,level+1));
                }

               
            }
             ans.add(temp);



            
        }


        return ans;
    }
}
