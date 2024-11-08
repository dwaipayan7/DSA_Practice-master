package practice;

import java.util.ArrayList;
import java.util.Stack;

public class TopSort {

    class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, Stack<Integer> stack) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtil(graph, vis, e.dest, stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge>[] graph, int vertices) {
        Stack<Integer> stack = new Stack<>();
        boolean[] vis = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!vis[i]) {
                topSortUtil(graph, vis, i, stack);
            }
        }

        // Print the topological order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int vertices = 6;  // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[vertices];

        // Initialize the adjacency list
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }

        // Create a TopSort object to access the inner Edge class
        TopSort ts = new TopSort();

        // Add edges to the graph
        graph[5].add(ts.new Edge(5, 2));
        graph[5].add(ts.new Edge(5, 0));
        graph[4].add(ts.new Edge(4, 0));
        graph[4].add(ts.new Edge(4, 1));
        graph[2].add(ts.new Edge(2, 3));
        graph[3].add(ts.new Edge(3, 1));

        // Perform topological sort
        System.out.println("Topological Sorting of the graph:");
        topSort(graph, vertices);
    }
}
