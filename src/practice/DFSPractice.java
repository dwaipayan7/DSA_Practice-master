package practice;

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

    public static void dfs(ArrayList<Edge>[]graph, int curr, boolean[] vis){
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
        int V = 5; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        // initialize array
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // add edges
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 4));

        boolean[] visited = new boolean[V];

        System.out.println("DFS traversal:");
        dfs(graph, 0, visited);
    }

}
