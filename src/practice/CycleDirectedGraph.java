package practice;

import java.util.ArrayList;

public class CycleDirectedGraph {

    class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    // Method to check for cycles in a directed graph
    public static boolean isCycleDirected(ArrayList<Edge>[] graph, boolean vis[], int curr, boolean[] rec) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (rec[e.dest]) {
                return true; // Cycle found
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
        int V = 4; // Number of vertices in the graph
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize the adjacency list
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Create a directed graph
        graph[0].add(new CycleDirectedGraph().new Edge(0, 1));
        graph[1].add(new CycleDirectedGraph().new Edge(1, 2));
        graph[2].add(new CycleDirectedGraph().new Edge(2, 3));
        graph[3].add(new CycleDirectedGraph().new Edge(3, 1)); // Creates a cycle

        // Visited and recursion stack arrays
        boolean[] vis = new boolean[V];
        boolean[] rec = new boolean[V];

        // Check for cycles in each component of the graph
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
