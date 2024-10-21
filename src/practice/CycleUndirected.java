package practice;

import java.util.ArrayList;

public class CycleUndirected {

    class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    // Function to check for cycles in an undirected graph
    public static boolean isCycleUndirected(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) { // If the neighbor is not visited
                if (isCycleUndirected(graph, vis, e.dest, curr)) {
                    return true;
                }
            } else if (e.dest != par) { // If the neighbor is visited and not the parent, there's a cycle
                return true;
            }
        }
        return false;
    }

    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest) {
        graph[src].add(new CycleUndirected().new Edge(src, dest));
        graph[dest].add(new CycleUndirected().new Edge(dest, src)); // Since it's an undirected graph
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges to the graph
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 5);

        // Visited array to track visited nodes
        boolean[] vis = new boolean[V];

        // Check for a cycle in each component
        boolean hasCycle = false;
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (isCycleUndirected(graph, vis, i, -1)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        if (hasCycle) {
            System.out.println("Cycle Detected in the graph");
        } else {
            System.out.println("No Cycle Detected in the graph");
        }
    }
}
