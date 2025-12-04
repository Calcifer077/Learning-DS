class Solution {
    public void floydWarshall(int[][] dist) {
        // FLOYD WARSHALL Algorithm
        // The question states that there are no negative weight cycles.
        
        // If you were to detect negative edge cycles remove the first condition.
        // And if at any point dist[node][node] becomes negative, than there exists a negative weight cycle.
        
        int n = dist.length, max = 1_000_000_00;
        
        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i == j || i == k || j == k) continue;
                    
                    if(dist[i][k] == max || dist[k][j] == max) continue;
                    
                    if(dist[i][k] + dist[k][j] < dist[i][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        
    }
}