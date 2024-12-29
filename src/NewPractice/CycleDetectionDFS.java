package NewPractice;

import java.util.ArrayList;

public class CycleDetectionDFS {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static boolean isCycleDirected(ArrayList<Edge>[] graph, boolean[] vis, int curr, boolean[] rec) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (rec[e.dest]) {
                return true;
            } else if (!vis[e.dest]) {
                if (isCycleDirected(graph, vis, e.dest, rec)) {
                    return true;
                }
            }
        }

        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices

        // Initialize the graph as an adjacency list
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 1)); // This creates a cycle

        // Visited and recursion stack arrays
        boolean[] vis = new boolean[V];
        boolean[] rec = new boolean[V];

        // Check for cycles in all components of the graph
        boolean hasCycle = false;
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (isCycleDirected(graph, vis, i, rec)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        // Output the result
        if (hasCycle) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }
    }
}
