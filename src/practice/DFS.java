package practice;

import java.util.ArrayList;

public class DFS {

   static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            src = s;
            dest = d;
        }
    }

    public static void dfs(ArrayList<Edge>[]graph, int curr, boolean[]vis){
        System.out.print(curr+" ");
        vis[curr] = true;

        for (int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }


    public static void createGraph(ArrayList<Edge>[] graph) {
        // Initialize each index with an empty ArrayList
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 6));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 4));
        graph[6].add(new Edge(6, 5));
    }


    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> []graph = new ArrayList[V];
        createGraph(graph);

        boolean []vis = new boolean[V];
        for (int i=0; i<V; i++){
            if (!vis[i]){
                dfs(graph, i, vis);
            }
        }

    }

}
