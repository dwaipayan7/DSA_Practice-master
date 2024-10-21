package practice;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    class Edge {
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int wt) {
            src = s;
            dest = d;
            this.wt = wt;
        }
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int cost;
        public Pair(int n, int c) {
            node = n;
            cost = c;
        }

        @Override
        public int compareTo(Pair o) {
            return this.cost - o.cost;
        }
    }

    public static void primsAlgo(ArrayList<Edge>[] graph, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[V];
        pq.add(new Pair(0, 0)); // Starting from node 0 with cost 0
        int mstCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;
                mstCost += curr.cost;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    if (!vis[e.dest]) {
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }
        System.out.println("Minimum Spanning Tree Cost: " + mstCost);
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize graph
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges to the graph
        graph[0].add(new PrimsAlgorithm().new Edge(0, 1, 2));
        graph[0].add(new PrimsAlgorithm().new Edge(0, 3, 6));
        graph[1].add(new PrimsAlgorithm().new Edge(1, 0, 2));
        graph[1].add(new PrimsAlgorithm().new Edge(1, 2, 3));
        graph[1].add(new PrimsAlgorithm().new Edge(1, 3, 8));
        graph[1].add(new PrimsAlgorithm().new Edge(1, 4, 5));
        graph[2].add(new PrimsAlgorithm().new Edge(2, 1, 3));
        graph[2].add(new PrimsAlgorithm().new Edge(2, 4, 7));
        graph[3].add(new PrimsAlgorithm().new Edge(3, 0, 6));
        graph[3].add(new PrimsAlgorithm().new Edge(3, 1, 8));
        graph[4].add(new PrimsAlgorithm().new Edge(4, 1, 5));
        graph[4].add(new PrimsAlgorithm().new Edge(4, 2, 7));

        // Run Prim's algorithm
        primsAlgo(graph, V);
    }
}
