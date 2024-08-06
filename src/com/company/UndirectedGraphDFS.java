package com.company;

import java.util.ArrayList;

public class UndirectedGraphDFS {

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V];

        for (int i=0; i < V; i++){
            if (!vis[i]){
                if (dfs(i, adj, vis, -1)) return true;
            }
        }
        return false;
    }

    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean vis[], int parent){
        vis[v] = true;

        for (int neighbour: adj.get(v)){
            if (!vis[neighbour]){
                if (dfs(neighbour, adj, vis, v)){
                    return true;
                }
            }else if (parent != neighbour){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create an instance of UndirectedGraphDFS
        UndirectedGraphDFS graph = new UndirectedGraphDFS();

        // Number of vertices
        int V = 5;

        // Initialize adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(4).add(3);
        adj.get(4).add(1); // Adding an edge to create a cycle

        // Check if the graph contains a cycle
        if (graph.isCycle(V, adj)) {
            System.out.println("Graph contains a cycle");
        } else {
            System.out.println("Graph doesn't contain a cycle");
        }

        // Create another graph without a cycle
        int V2 = 3;
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>(V2);
        for (int i = 0; i < V2; i++) {
            adj2.add(new ArrayList<>());
        }

        // Add edges to the second graph
        adj2.get(0).add(1);
        adj2.get(1).add(0);
        adj2.get(1).add(2);
        adj2.get(2).add(1);

        // Check if the second graph contains a cycle
        if (graph.isCycle(V2, adj2)) {
            System.out.println("Graph contains a cycle");
        } else {
            System.out.println("Graph doesn't contain a cycle");
        }
    }
    }


