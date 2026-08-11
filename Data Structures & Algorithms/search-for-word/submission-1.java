class Solution {

    boolean found=false;
    public void helper(char[][] board,String word,int i,int j,int index,boolean[][] vis){
        int n=board.length;
        int m=board[0].length;
        if(i<0 || j<0 || i>=n || j>=m || board[i][j]!=word.charAt(index) || vis[i][j]) return;
        if(index==word.length()-1) {
            found= true;

            return;
        }

        vis[i][j]=true;


        helper(board,word,i,j+1,index+1,vis);
          helper(board,word,i-1,j,index+1,vis);
            helper(board,word,i,j-1,index+1,vis);
              helper(board,word,i+1,j,index+1,vis);

              vis[i][j]=false;
    }
    public boolean exist(char[][] board, String word) {

        boolean[][] vis = new boolean[board.length][board[0].length];
  int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                helper(board,word,i,j,0,vis);
            }
                            if (found) {
                    return true;
                }

        }
       

        return found;
    }
}
