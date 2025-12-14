class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public DisjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            size.add(1);
            parent.add(i);
        }
    }

    public int findPar(int node) {
        if (node == parent.get(node))
            return node;

        int ultimatePar = findPar(parent.get(node));
        parent.set(node, ultimatePar);

        return ultimatePar;
    }

    public void unionByRank(int u, int v) {
        int ultimateParU = findPar(u);
        int ultimateParV = findPar(v);

        if (ultimateParU == ultimateParV)
            return;

        if (rank.get(ultimateParU) < rank.get(ultimateParV)) {
            parent.set(ultimateParU, ultimateParV);
        } else if (rank.get(ultimateParU) > rank.get(ultimateParV)) {
            parent.set(ultimateParV, ultimateParU);
        } else {
            parent.set(ultimateParV, ultimateParU);
            int rankU = rank.get(ultimateParU);
            rank.set(ultimateParU, rankU + 1);
        }
    }

    public void unionBySize(int u, int v) {
        int ultimateParU = findPar(u);
        int ultimateParV = findPar(v);

        if (ultimateParU == ultimateParV)
            return;

        if (size.get(ultimateParU) < size.get(ultimateParV)) {
            parent.set(ultimateParU, ultimateParV);
            size.set(ultimateParV, size.get(ultimateParV) + size.get(ultimateParU));
        } else {
            parent.set(ultimateParV, ultimateParU);
            size.set(ultimateParU, size.get(ultimateParV) + size.get(ultimateParU));
        }

    }
}

class Solution {
    public int spanningTree(int V, int[][] edges) {
        // Kruskal's algorithm using disjoint set
        Arrays.sort(edges, Comparator.comparingDouble(e -> e[2]));
        
        DisjointSet ds = new DisjointSet(V);
        
        int res = 0;
        
        for(int a[] : edges){
            int u = a[0];
            int v = a[1];
            int d = a[2];
            
            if(ds.findPar(u) != ds.findPar(v)){
                res += d;
                ds.unionBySize(u, v);
            }
        }
        
        
        return res;
    }
}