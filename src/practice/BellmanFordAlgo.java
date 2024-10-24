package practice;

import java.util.ArrayList;

public class BellmanFordAlgo {

    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src) {
        int V = graph.length;
        int dist[] = new int[V];

        // Initialize the distance array
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;  // Set all distances to infinity
        }
        dist[src] = 0;  // Set the distance to the source itself as 0

        // Bellman-Ford algorithm
        for (int i = 0; i < V - 1; i++) { // Relax all edges (V-1) times
            for (int j = 0; j < V; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int w = e.wt;

                    if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                        dist[v] = dist[u] + w;
                    }
                }
            }
        }

        // Detect negative weight cycles
        for (int j = 0; j < V; j++) {
            for (int k = 0; k < graph[j].size(); k++) {
                Edge e = graph[j].get(k);
                int u = e.src;
                int v = e.dest;
                int w = e.wt;

                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                    System.out.println("Negative Weight Cycle Detected");
                    return;
                }
            }
        }

        // Print shortest distances from the source
        System.out.println("Shortest distances from source vertex " + src + ":");
        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("Vertex " + i + ": INF");
            } else {
                System.out.println("Vertex " + i + ": " + dist[i]);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize adjacency list for each vertex
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges to the graph
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 4, 1));

        int src = 0; // Set the source vertex

        // Calling the Bellman-Ford algorithm
        bellmanFord(graph, src);
    }
}
