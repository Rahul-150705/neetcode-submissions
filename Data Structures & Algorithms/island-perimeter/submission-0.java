class Solution {
    private boolean[][] visited;
    public int dfs(int[][] grid,int r,int c)
    {
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0)
        {
            return 1;
        }
        if(visited[r][c]==true)
        {
            return 0;
        }
        visited[r][c]=true;
        return dfs(grid,r,c+1)+dfs(grid,r,c-1)+dfs(grid,r+1,c)+dfs(grid,r-1,c);

    }

    public int islandPerimeter(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        this.visited = new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    return dfs(grid,i,j);
                }
            }
        }
        return 0;
    }
}