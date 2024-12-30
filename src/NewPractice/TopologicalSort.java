package NewPractice;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> stack) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    static void topSort(ArrayList<Edge>[] graph, int V) {
        boolean[] vis = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSortUtil(graph, i, vis, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize the graph
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges (Directed graph)
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        System.out.println("Topological Sort:");
        topSort(graph, V);
    }
}
