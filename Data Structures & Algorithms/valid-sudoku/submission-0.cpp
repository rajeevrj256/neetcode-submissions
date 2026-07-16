class Solution {
public:

    bool isValidPos(vector<vector<char>>&board,char ch,int row,int col){
          for(int i=0;i<9;i++){
            if(i!=row && board[i][col]==ch) return false;
        }

         for(int i=0;i<9;i++){
            if(i!=col && board[row][i]==ch) return false;
        }
        int startRow=(row/3)*3;
        int colRow=(col/3)*3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=colRow;j<colRow+3;j++){
                if((i!=row || j!=col) && board[i][j]==ch) return false;
            }
        }


        return true;
    }
    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
              
                    if(board[i][j]=='.') continue;
                    if(! isValidPos(board,board[i][j],i,j)){
                        return false;
                  
                }

               
            }
        }


        return true;

       
    }
};
