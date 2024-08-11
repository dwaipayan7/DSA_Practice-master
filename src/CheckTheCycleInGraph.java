import java.util.ArrayList;

public class CheckTheCycleInGraph {

    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                if (dfs(i, adj, vis, -1)) return true;
            }
        }
        return false;
    }

    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int parent) {
        vis[v] = true;
        for (int neighbour : adj.get(v)) {
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
        int v = 5; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);

        // Initialize the adjacency list
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(4);
        adj.get(4).add(3);

        adj.get(4).add(1); // Adding this edge creates a cycle
        adj.get(1).add(4);

        CheckTheCycleInGraph cycleChecker = new CheckTheCycleInGraph();
        boolean hasCycle = cycleChecker.isCycle(v, adj);

        if (hasCycle) {
            System.out.println("Graph contains a cycle");
        } else {
            System.out.println("Graph does not contain a cycle");
        }
    }
}
