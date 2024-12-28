package NewPractice;

import java.util.ArrayList;

public class PrintAllPath {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void printAllPath(
            ArrayList<Edge>[] graph, boolean[] vis, int curr, String path, int tar) {
        if (curr == tar) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[curr]) {
                vis[curr] = true;
                printAllPath(graph, vis, e.dest, path + e.dest + " ", tar);
                vis[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize the adjacency list for the graph
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 4));

        boolean[] vis = new boolean[V];
        int src = 0; // Source node
        int tar = 4; // Target node

        System.out.println("All paths from " + src + " to " + tar + ":");
        printAllPath(graph, vis, src, src + " ", tar);
    }
}
