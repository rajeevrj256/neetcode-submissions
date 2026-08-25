class Solution {
   
    void markVisted(int node,List<List<Integer>>adj,List<Boolean>vis){
        vis.set(node,true);

        for(int neighbor:adj.get(node)){
            if(!vis.get(neighbor)){
                markVisted(neighbor,adj,vis);
            }
        }
    }
    public int countComponents(int n, int[][] edges) {
     List<List<Integer>>adj=new ArrayList<>(n);
     List<Boolean>vis=new ArrayList<>(n);
     for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
        vis.add(false);
     }
     for(int[] edge:edges){
        int u=edge[0];
        int v=edge[1];

        adj.get(u).add(v);
        adj.get(v).add(u);

     }

int count=0;
     for(int i=0;i<n;i++){
        if(!vis.get(i)){
            count++;
            markVisted(i,adj,vis);
        }
     }


     return count;

     
    }
}
