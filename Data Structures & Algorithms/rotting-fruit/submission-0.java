class Solution {
    public int orangesRotting(int[][] grid) {
       int freshCount=0;
       Queue<int[]>q = new LinkedList<>();
       int m = grid.length;
       int n =grid[0].length;
       int time =0;
       int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
       for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    freshCount++;
                }
            }
        }
        if(freshCount==0){
            return 0;
        }
        while(!q.isEmpty()){
            int N = q.size();
            while(N-->0){
                int[]val = q.poll();
                for(int[] dir : directions){
                    int row = val[0] + dir[0];
                    int col = val[1] + dir[1];
                    if(row>=0 && row<m && col >=0 && col<n){
                        if(grid[row][col]==1){
                            grid[row][col]=2;
                            q.offer(new int[]{row,col});
                            freshCount--;
                        }
                    }
                }
            }
            time++;
        }

        return (freshCount==0? (time-1) : -1);
    }
}
