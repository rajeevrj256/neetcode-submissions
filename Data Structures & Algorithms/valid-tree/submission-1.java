class Solution {

    public boolean dfs(int node,List<List<Integer>>adj,List<Integer>parent,List<Boolean>vis){
        vis.set(node,true);
        
        for(int neighbor:adj.get(node)){

            if(!vis.get(neighbor)){
              parent.set(neighbor,node);
              dfs(neighbor,adj,parent,vis);
            }else if(parent.get(node)!=neighbor){
                return false;
            }
        }

        return true;
    }
    public boolean validTree(int n, int[][] edges) {
       List<List<Integer>>adj=new ArrayList<>(n);
         List<Integer>parent=new ArrayList<>(n);
       List<Boolean>vis=new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
                vis.add(false);
                parent.add(-1);
            }
       for(int[] edge:edges){
        int u=edge[0];
        int v=edge[1];
        adj.get(u).add(v);
        adj.get(v).add(u);

       }


      
        if(!dfs(0,adj,parent,vis)) return false;
       
        for(boolean it:vis){
            if(!it) return false;
        }

        return true;



      

    }
}
