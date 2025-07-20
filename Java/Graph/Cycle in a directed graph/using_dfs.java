class Solution {
    public boolean dfs(List<List<Integer>> adj, int start, boolean visited[], boolean pathvis[]){
        visited[start] = true;
        pathvis[start] = true;
        
        for(int i = 0; i < adj.get(start).size(); i++){
            int a = adj.get(start).get(i);
            
            if(visited[a] && pathvis[a]){
                return true;
            }else if(!visited[a]){
                if(dfs(adj, a, visited, pathvis)){
                    return true;
                }
            }
        }
        
        pathvis[start] = false;
        return false;
    }
    
    public boolean isCyclic(int V, int[][] edges) {
        // Creating a adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            adj.get(u).add(v);
        }
        
        // Explanation is in notes, video -> striver
        boolean visited[] = new boolean[V];
        boolean pathvis[] = new boolean[V];
        
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                if(dfs(adj, i, visited, pathvis)){
                    return true;
                }
            }
        }
        
        return false;
    }
}