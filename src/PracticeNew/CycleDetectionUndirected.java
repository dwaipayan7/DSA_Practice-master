package PracticeNew;
import java.util.ArrayList;

public class CycleDetectionUndirected {

    static class Edge {
        int src;
        int dest;
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static boolean isCycleUndirected(ArrayList<Edge>[] graph, int curr, boolean[] vis, int par) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] && e.dest != par) {
                return true;
            } else if (!vis[e.dest]) {
                if (isCycleUndirected(graph, e.dest, vis, curr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices

        // Initialize the graph
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to create a cyclic graph (example)
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));

        boolean[] vis = new boolean[V];
        boolean cycleExists = false;

        // Check each component for cycles
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (isCycleUndirected(graph, i, vis, -1)) {
                    cycleExists = true;
                    break;
                }
            }
        }

        System.out.println("Cycle exists in the graph: " + cycleExists);
    }
}