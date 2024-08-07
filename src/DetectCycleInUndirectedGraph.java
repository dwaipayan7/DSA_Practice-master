import java.util.ArrayList;

public class DetectCycleInUndirectedGraph {

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){

        boolean vis[] = new boolean[V];

        for (int i=0 ; i< V;i++){
            if (!vis[i]){
                if (dfs(i, adj, vis, -1)) return true;
            }
        }
        return false;
    }

    public boolean dfs(int v, ArrayList<ArrayList<Integer>>adj, boolean vis[], int parent) {

        vis[v] = true;

        for (Integer neighbour : adj.get(v)) {
            if (!vis[neighbour]) {
                if (dfs(neighbour, adj, vis, v)) {
                    return true;

                }
            } else if (parent != neighbour) {

                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 3, 4);

        DetectCycleInUndirectedGraph graph = new DetectCycleInUndirectedGraph();
        boolean hasCycle = graph.isCycle(V, adj);
        if (hasCycle) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn't contain cycle");
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

}


