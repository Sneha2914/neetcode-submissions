class Solution {
    int result=0;
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int count =0;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges)
        {
            int neighbour = edge[0];
            int second = edge[1];
            adj.get(neighbour).add(second);
            adj.get(second).add(neighbour);
        }
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i])
            {
                count++;
                dfs(i,adj, visited);
            }
        }
        return count;
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>>adj,boolean[] visited){
        visited[node]= true;
        for(int val : adj.get(node)){
            if(!visited[val]){
                dfs(val,adj,visited);
            }
        }

    }
}
