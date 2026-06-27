class Solution {
    public int numIslands(char[][] grid) {
      int count =0;
      int m = grid.length;
      int n = grid[0].length;
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]=='1'){
                count++;
                dfs(i,j,grid);
            }
        }
      }
      return count;     
    }
    void dfs(int row, int column, char[][] grid){
        if(row>=grid.length || column>=grid[0].length || row<0 || column<0){
            return;
        }
        if(grid[row][column]=='0')
            return;
        grid[row][column]='0';
        dfs(row+1,column,grid);
        dfs(row-1,column,grid);
        dfs(row,column+1,grid);
        dfs(row,column-1,grid);
    }
}
