package PracticeNew;

import java.util.ArrayList;

public class AllPathVisitGraph {

    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void printAllPaths(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int target){

        if (curr == target){
            System.out.println(path);
            return;
        }

        for (int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                vis[curr] = true;
                printAllPaths(graph, vis, e.dest, path+e.dest, target);
                vis[curr] = false;
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

        // Add edges (directed graph)
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 6)); // Target node 5 is now reachable

        int src = 0, target = 5;
        System.out.println("All paths from " + src + " to " + target + ":");
        printAllPaths(graph, new boolean[V], src, "0", target);
    }

}
