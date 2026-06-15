class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> row=new HashMap<>();                          
        Map<Integer,Set<Character>> col=new HashMap<>();                          
        Map<String,Set<Character>> squ=new HashMap<>();
        for(int r=0;r<9;r++)
        {
            for(int c=0;c<9;c++)
            {
                if(board[r][c]=='.') continue;
                String square=(r/3)+","+(c/3);
                char val=board[r][c];
                row.putIfAbsent(r, new HashSet<>());
                col.putIfAbsent(c, new HashSet<>());
                squ.putIfAbsent(square, new HashSet<>());
                if(row.get(r).contains(board[r][c]) || col.get(c).contains(board[r][c]) || squ.get(square).contains(board[r][c]))
                {
                    return false;
                }
                row.get(r).add(val);
                col.get(c).add(val);
                squ.get(square).add(val);
            }
        }
        return true;
        }
    }
