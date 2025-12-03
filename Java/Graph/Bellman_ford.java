class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        // Bellman-ford
        int dist[] = new int[V];
        int max = Integer.MAX_VALUE;
        Arrays.fill(dist, max);
        
        dist[src] = 0;
        
        // Do relaxation for V - 1 times
        for(int i = 0; i < V; i++){
            for(int a[] : edges){
                int u = a[0], v = a[1], d = a[2];
                
                if(dist[u] != max){
                    if(dist[u] + d < dist[v]){
                        dist[v] = dist[u] + d;
                    }
                }
            }
        }
        
        // Check for negative weight cycle, if there is a relaxation even after V - 1 times, than there is a negative weight cycle.
        for(int a[] : edges){
            int u = a[0], v = a[1], d = a[2];
                
            if(dist[u] != max){
                if(dist[u] + d < dist[v]){
                    return new int[]{-1};
                }
            }
        }
            
        return dist;
    }
}
