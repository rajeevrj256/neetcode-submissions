class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer,Pair<Integer,Integer>>>q=new LinkedList<>();

        int n=grid.length;
        int m=grid[0].length;

        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2) q.offer(new Pair<>(0,new Pair<>(i,j)));
                if(grid[i][j]==1) fresh++;
            }
        }


int time=0;
        while(!q.isEmpty()){
            Pair<Integer,Pair<Integer,Integer>>top=q.peek();
            q.poll();
            time=top.getKey();
            Pair<Integer,Integer>index=top.getValue();

            int i=index.getKey();
            int j=index.getValue();


            if(i-1>=0 && grid[i-1][j]==1){
                q.offer(new Pair<>(time+1,new Pair<>(i-1,j)));
                fresh--;
                grid[i-1][j]=2;
            }
            if(i+1<n && grid[i+1][j]==1){
                q.offer(new Pair<>(time+1,new Pair<>(i+1,j)));
                fresh--;
                grid[i+1][j]=2;
            }
            if(j-1>=0 && grid[i][j-1]==1){
                q.offer(new Pair<>(time+1,new Pair<>(i,j-1)));
                fresh--;
                grid[i][j-1]=2;
            }
            if(j+1<m&& grid[i][j+1]==1){
                q.offer(new Pair<>(time+1,new Pair<>(i,j+1)));
                fresh--;
                grid[i][j+1]=2;
            }
        }

        return fresh!=0 ?-1:time;

    }
}
