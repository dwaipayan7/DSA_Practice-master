package practice;
import java.util.*;

public class TopoLogicalSort {

    class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            src = s;
            dest = d;
        }
    }

    public static void topSortUtil(ArrayList<Edge>[]graph, boolean[]vis, int curr, Stack<Integer>stack){
        vis[curr] = true;
        for (int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[curr]){
                topSortUtil(graph, vis, e.dest, stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge>[]graph, int V){
        boolean[]vis = new boolean[V];
        Stack<Integer>stack = new Stack<>();
        for (int i=0; i<V;i++){
            if (!vis[i]){
                topSortUtil(graph, vis, i, stack);
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        int V = 6; // Number of vertices in the graph
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Initialize the adjacency list
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Creating a directed acyclic graph (DAG)
        graph[0].add(new TopoLogicalSort().new Edge(0, 3));
        graph[1].add(new TopoLogicalSort().new Edge(1, 3));
        graph[1].add(new TopoLogicalSort().new Edge(1, 4));
        graph[2].add(new TopoLogicalSort().new Edge(2, 4));
        graph[3].add(new TopoLogicalSort().new Edge(3, 5));
        graph[4].add(new TopoLogicalSort().new Edge(4, 5));

        // Perform topological sort
        System.out.println("Topological Sort of the graph:");
        topSort(graph, V);
    }
}
