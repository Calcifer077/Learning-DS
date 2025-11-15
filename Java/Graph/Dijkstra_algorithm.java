class Solution {
    class Item{
        int dist;
        int node;
        
        public Item(int dist, int node){
            this.dist = dist;
            this.node = node;
        }
    }
    
    public int[] dijkstra(int V, int[][] edges, int src) {
        // Using priority queue to do dijkstra.
        
        // Creating a adjacency list
        // 'int[]' as graph is weighted.
        // 'int[0]' -> node, 'ind[1]' -> weight.
        List<List<int[]>> adj = new ArrayList<>();
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int d = edges[i][2];
            
            int arr1[] = {v, d};
            int arr2[] = {u, d};
            
            adj.get(u).add(arr1);
            adj.get(v).add(arr2);
        }
        
        int[] dist = new int[V];
        
        // Initally all nodes are unreachable, that's why marking them as infinity.
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        // min heap, that will prefer distance between nodes, if that distance is same than the node will smaller value will appear on top.
        PriorityQueue<Item> pq = new PriorityQueue<>((Item a, Item b) -> {
            if(a.dist == b.dist){
                return Integer.compare(a.node, b.node);
            }else{
                return Integer.compare(a.dist, b.dist);
            }
        });
        
        // 'src' is reachable by 0.
        dist[src] = 0;
        Item newIm = new Item(dist[src], src);
        
        pq.offer(newIm);
        
        // Performing dijkstra until q is empty.
        while(!pq.isEmpty()){
            Item curr = pq.poll();
            
            int d = curr.dist;
            int node = curr.node;
            
            for(int[] arr : adj.get(node)){
                // If the new distance is smaller than the one that is already written in 'dist' array update it and insert it into queue again.
                int newDist = arr[1] + d;
                if(newDist < dist[arr[0]]){
                    dist[arr[0]] = newDist;
                    
                    Item newItem = new Item(newDist, arr[0]);
                    pq.offer(newItem);
                }
            }
        }
        
        return dist;
        
    }
}