class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]>q = new LinkedList<>();
        int level = 1;
        int[][] directions = {{-1,0},{1,0},{0,1},{0,-1}};
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int N = q.size();
            while(N-- >0){
                int[]val = q.poll();
                int i = val[0];
                int j = val[1];
                for(int[]dir : directions){
                    int row = i+ dir[0];
                    int col = j+ dir[1];
                    if(row>=0 && col>=0 && row<m && col<n && grid[row][col]==2147483647){
                        grid[row][col]=level;
                        q.offer(new int[]{row,col});
                    }
                }
            }
            level++;
        }   
    }
}
