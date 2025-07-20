class Solution {
    public static void dfs(ArrayList<ArrayList<Integer>> adj, boolean visited[], int start, Stack<Integer> st){
        visited[start] = true;
        for(int i = 0; i < adj.get(start).size(); i++){
            int a = adj.get(start).get(i);
            
            if(!visited[a]){
                dfs(adj, visited, a, st);
            }
        }
        st.push(start);
    }
    
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0;i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v= edges[i][1];
            
            adj.get(u).add(v);
        }
        
        boolean visited[] = new boolean[V];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                dfs(adj, visited, i, st);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        while(!st.isEmpty()){
            res.add(st.pop());
        }
        
        return res;
    }
}