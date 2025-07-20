public List<Integer> toposort(int v, List<List<Integer>> adj){
        int indegree[] = new int[v];
        
        for(int i = 0; i < v; i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < v; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        
        List<Integer> topo = new ArrayList<>();
        
        while(!q.isEmpty()){
            int node = q.peek();
            
            q.remove();
            
            topo.add(node);
            
            for(int it: adj.get(node)){
                indegree[it]--;
                
                if(indegree[it] == 0) q.add(it);
            }
        }
        
        return topo;
    }
