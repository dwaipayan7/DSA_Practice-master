package practice;

import java.util.ArrayList;

public class CycleDetectionGraph {

    static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            src = s;
            dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCycle(ArrayList<Edge> graph[], boolean[] vis, int curr, boolean[] rec) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if (rec[e.dest]){ // If the node is in the recursion stack, a cycle is detected.
                return true;
            } else if (!vis[e.dest]) { // If the node has not been visited, continue DFS
                if (isCycle(graph, vis, e.dest, rec)){
                    return true;
                }
            }
        }

        rec[curr] = false; // Backtrack and remove the current node from the recursion stack
        return false;
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean vis[] = new boolean[V]; // Array to track visited nodes
        boolean rec[] = new boolean[V]; // Recursion stack to track nodes in the current DFS path

        for (int i=0; i<V; i++){
            if (!vis[i]){ // Check if the node has not been visited
                boolean isCyclePresent = isCycle(graph, vis, i, rec); // Perform DFS to check cycle
                if (isCyclePresent){
                    System.out.println("Cycle Detected");
                    break;
                }
            }
        }
    }
}
