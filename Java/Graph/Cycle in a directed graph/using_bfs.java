class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // Creating a adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        
        int indegree[] = new int[V];
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            adj.get(u).add(v);
            
            indegree[v]++;
        }
        
        // Using BFS (Kahn's algrithm)
        // We will try to do topo sort on the given graph. 
        // If the topo sort was successfull(all nodes were included in it), then there is no cycle.
        // Else there is a cycle.
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < V; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        while(!q.isEmpty()){
            int a = q.remove();
            list.add(a);
            
            for(int i = 0; i< adj.get(a).size(); i++){
                int u = adj.get(a).get(i);
                
                indegree[u]--;
                
                if(indegree[u] == 0){
                    q.add(u);
                }
            }
        }
        
        return !(list.size() == V);
    }
}