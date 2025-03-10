package PracticeNew;

import java.util.ArrayList;

public class DFSPractice {

    static class Edge{
        int src;
        int dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    static void dfs(ArrayList<Edge>graph[], int curr, boolean vis[]){
        System.out.print(curr+" ");
        vis[curr] = true;

        for (int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph (example graph)
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));
        graph[2].add(new Edge(2, 5));
        graph[2].add(new Edge(2, 6));

        boolean[] vis = new boolean[V]; // Visited array
        System.out.println("DFS Traversal:");
        dfs(graph, 0, vis);
    }

}
