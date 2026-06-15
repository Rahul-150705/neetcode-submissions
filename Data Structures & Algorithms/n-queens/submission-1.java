class Solution {
        Set<Integer> col = new HashSet<>();
        Set<Integer> posDiag = new HashSet<>();
        Set<Integer> negDiag = new HashSet<>();
        List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char [] [] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        backtrack(0,n,board);
        return res;
    }
    private void backtrack(int r,int n,char [] [] board)
    {
        if(r==n)
        {
            List<String> copy=new ArrayList<>();
            for(char [] row:board)
            {
                copy.add(new String(row));
            }
            res.add(copy);
            return ;
        }
        for(int i=0;i<n;i++)
        {
            if(col.contains(i) || posDiag.contains(r+i) || negDiag.contains(r-i)) 
            {
                if(i>n) return ;
                else continue;
            }
            col.add(i);
            posDiag.add(r+i);
            negDiag.add(r-i);
            board[r][i]='Q';
            backtrack(r+1,n,board);
            col.remove(i);
            posDiag.remove(r+i);
            negDiag.remove(r-i);
            board[r][i]='.';
        }
    }
}
