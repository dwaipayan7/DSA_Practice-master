package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BFS_Practice {
    public static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int[] pred, int[] dist){
        LinkedList<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++){
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }
        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()){
            int cur = queue.remove();
            for (int i = 0; i < adj.get(cur).size(); i++){
                int neighbour = adj.get(cur).get(i);

                if (!visited[neighbour]){
                    visited[neighbour] = true;

                    dist[neighbour] = dist[cur] + 1;
                    pred[neighbour] = cur;
                    queue.add(neighbour);

                    if (neighbour == dest)
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 2);
        addEdge(adj, 3, 4);
        addEdge(adj, 3, 7);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 4, 7);
        addEdge(adj, 5, 6);
        addEdge(adj, 6, 7);

        int src = 0, dest = 7;
        int[] pred = new int[v];
        int[] dist = new int[v];

        if (bfs(adj, src, dest, v, pred, dist)) {
            System.out.println("Shortest path length is: " + dist[dest]);

            // Print the path
            List<Integer> path = new LinkedList<>();
            int crawl = dest;
            path.add(crawl);
            while (pred[crawl] != -1) {
                path.add(pred[crawl]);
                crawl = pred[crawl];
            }

            System.out.println("Path is: ");
            for (int i = path.size() - 1; i >= 0; i--) {
                System.out.print(path.get(i) + " ");
            }
        } else {
            System.out.println("Given source and destination are not connected");
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
