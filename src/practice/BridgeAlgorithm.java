package practice;

import java.util.ArrayList;

public class BridgeAlgorithm {

    static class Edge {
        int src;
        int dest;
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void getBridge(ArrayList<Edge>[] graph, int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis, dt, low, time, -1);
            }
        }
    }

    private static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis, int[] dt, int[] low, int time, int par) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (e.dest == par) {
                continue;
            } else if (!vis[e.dest]) {
                dfs(graph, e.dest, vis, dt, low, time, curr);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if (dt[curr] < low[e.dest]) {
                    System.out.println("Bridge is " + curr + " --> " + e.dest);
                }
            } else {
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 3, 4);

        // Find and print bridges
        System.out.println("Bridges in the graph:");
        getBridge(graph, V);
    }

    private static void addEdge(ArrayList<Edge>[] graph, int src, int dest) {
        graph[src].add(new Edge(src, dest));
        graph[dest].add(new Edge(dest, src));
    }
}
