class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // Kahn's algorithm, check notes and striver video.
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0;i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        int indegree[] = new int[V];
        
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            adj.get(u).add(v);
            indegree[v]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        while(!q.isEmpty()){
            int a = q.remove();
            res.add(a);
            
            for(int i = 0; i < adj.get(a).size(); i++){
                int u = adj.get(a).get(i);
                
                indegree[u]--;
                
                if(indegree[u] == 0){
                    q.add(u);
                }
            }
        }
        
        
        
        return res;
    }
}