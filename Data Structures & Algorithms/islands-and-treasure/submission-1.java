class Solution {

    public void islandsAndTreasure(int[][] grid) {
        Queue<Pair<Integer,Integer>>q=new LinkedList<>();

        int n=grid.length;
        int m=grid[0].length;


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0) {
                    q.offer(new Pair<>(i,j));
                   
                }

            }
        }

        while(!q.isEmpty()){
               Pair<Integer, Integer> pair = q.peek();
                 q.poll();
                int i = pair.getKey();
                int j = pair.getValue();
                int distance=grid[i][j];


                if(i-1>=00 && grid[i-1][j]==Integer.MAX_VALUE){
                    grid[i-1][j]=distance+1;

                    q.offer(new Pair<>(i-1,j));
                }
                if(i+1<n && grid[i+1][j]==Integer.MAX_VALUE){
                    grid[i+1][j]=distance+1;

                    q.offer(new Pair<>(i+1,j));
                }
                if(j-1>=0 && grid[i][j-1]==Integer.MAX_VALUE){
                    grid[i][j-1]=distance+1;

                    q.offer(new Pair<>(i,j-1));
                }
                if(j+1<m && grid[i][j+1]==Integer.MAX_VALUE){
                    grid[i][j+1]=distance+1;

                    q.offer(new Pair<>(i,j+1));
                }
        }
    }
}
 