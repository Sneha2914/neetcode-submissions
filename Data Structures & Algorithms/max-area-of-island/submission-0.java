class Solution {
    public int maxAreaOfIsland(int[][] grid) {
      int result =0;
      int m = grid.length;
      int n = grid[0].length;
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==1){
                result = Math.max(result, dfs(i,j,grid));
            }
        }
      }
      return result;  
    }

    public int dfs(int row, int column, int[][] grid){
        if(row<0 || row>=grid.length || column<0 || column>=grid[0].length){
            return 0;
        }
        if(grid[row][column]==0){
            return 0;
        }
        grid[row][column]=0;
        int area =1;
        area+=dfs(row+1,column,grid);
        area+=dfs(row-1, column,grid);
        area+=dfs(row, column+1, grid);
        area+=dfs(row, column-1, grid);
        return area;
    }
}
