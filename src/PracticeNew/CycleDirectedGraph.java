package PracticeNew;

import java.util.ArrayList;

public class CycleDirectedGraph {

    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // DFS function to check for cycles in a directed graph
    public static boolean isCycleDirected(ArrayList<Edge>[] graph, boolean[] vis, boolean[] rec, int curr) {
        vis[curr] = true;
        rec[curr] = true;

        for (Edge e : graph[curr]) {
            if (rec[e.dest]) {
                return true; // Found cycle
            } else if (!vis[e.dest] && isCycleDirected(graph, vis, rec, e.dest)) {
                return true;
            }
        }

        rec[curr] = false; // Remove from recursion stack (backtracking)
        return false;
    }

    // Function to check the entire graph for cycles (handles disconnected graphs)
    public static boolean detectCycle(ArrayList<Edge>[] graph, int V) {
        boolean[] vis = new boolean[V];
        boolean[] rec = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i] && isCycleDirected(graph, vis, rec, i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add directed edges (Example: Cycle exists)
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1)); // This edge creates a cycle

        // Check if the graph has a cycle
        if (detectCycle(graph, V)) {
            System.out.println("Cycle detected in the directed graph.");
        } else {
            System.out.println("No cycle found.");
        }
    }
}
