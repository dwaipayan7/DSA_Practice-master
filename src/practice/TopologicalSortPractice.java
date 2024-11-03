package practice;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortPractice {

   static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            src = s;
            dest = d;
        }
    }

    public static void topSortUtil(ArrayList<Edge>[]graph, int curr, boolean[]vis, Stack<Integer>stack){
        vis[curr] = true;
        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge>[]graph, int V){
       boolean[]vis =  new boolean[V];
        Stack<Integer>stack = new Stack<>();
       for (int i=0; i<V; i++){
           if (!vis[i]){
               topSortUtil(graph, i, vis, stack);
           }
           while (!stack.isEmpty()){
               System.out.print(stack.pop()+" ");
           }
       }
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize the adjacency list for each vertex
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        // Perform topological sort
        System.out.println("Topological Sort of the graph:");
        topSort(graph, V);
    }


}
