class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(dfs(board,word,i,j,0)==true)
                {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, String word,int r,int c,int i)
    {
        if(i==word.length())
        {
            return true;
        } 
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length ||
            board[r][c] != word.charAt(i) || board[r][c] == '#') {
            return false;
        }
        char temp=board[r][c];
        board[r][c]='#';
        boolean res=dfs(board,word,r,c+1,i+1) ||
        dfs(board,word,r,c-1,i+1) ||
        dfs(board,word,r+1,c,i+1) ||
        dfs(board,word,r-1,c,i+1) ;
        board[r][c]=temp;
        return res;
    }
}
