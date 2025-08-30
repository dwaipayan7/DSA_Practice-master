package PracticeNew1;

import PracticeNew.BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFS_Practice {

    static class Edge {
        int src;
        int dest;
        public Edge(int src,int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static void bfs(ArrayList<Edge>graph[], int v,  boolean[] vis, int start){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        while (!q.isEmpty()){
            int curr = q.poll();
            if (!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
            }

            for (int i = 0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]){
                    q.add(e.dest);
                }
            }
        }
    }


    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));

        boolean[] vis = new boolean[V]; // Visited array

        System.out.println("BFS traversal starting from node 0:");
        bfs(graph, V, vis, 0);
    }

}
