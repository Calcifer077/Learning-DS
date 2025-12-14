class Solution {
    
    class Item{
        int wei;
        int node;
        int parent;
        
        public Item(int wei, int node, int parent){
            this.wei = wei;
            this.node = node;
            this.parent = parent;
        }
    }
    
    public int spanningTree(int V, int[][] edges) {
        // PRIM'S ALGORITHM
        // How Prim's algorithm works?
        // Start from any vertex at random. 
        // We know that every vertex will be connected to some other vertex using some edge so selecting any random vertex will not have a affect on our answer.
        // After selecting any vertex choose one of the edges which have minimum weight among all.
        // After selecting this edge we will be connected to some other vertex, which will give us some new edges, select the minimum from these available edges.
        // Don't select the same vertex twice.
        
        // Use priority queue ( min - heap ) to store edges by weight and visited array so that we don't visit the same vertex twice.
        
        // FORMING ADJACENCY LIST
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int a[] : edges){
            int u = a[0];
            int v = a[1];
            int d = a[2];
            
            adj.get(u).add(new int[] {v, d});
            adj.get(v).add(new int[] {u, d});
        }
        
        // This will store the sum of weights of different edges which are present in MST.
        int sum = 0;
        
        PriorityQueue<Item> pq = new PriorityQueue<>((Item a, Item b) -> a.wei - b.wei);
        
        boolean vis[] = new boolean[V];
        
        pq.add(new Item(0, 0, -1));
        
        while(!pq.isEmpty()){
            Item curr = pq.remove();
            
            int wei = curr.wei;
            int node = curr.node;
            int parent = curr.parent;
            
            if(vis[node]) continue;
            
            // If parent will be -1, than that means that this is the starting vertex from where we started our algorithm.
            if(parent != -1){
                sum += wei;
            }
            
            vis[node] = true;
            
            for(int a[] : adj.get(node)){
                int v = a[0];
                int d = a[1];
                
                if(!vis[v]){
                    pq.offer(new Item(d, v, node));
                }
            }
        }
        
        return sum;
        
    }
}