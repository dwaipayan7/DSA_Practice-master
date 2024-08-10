import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Practice2 {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void bfs(ArrayList<ArrayList<Integer>> adj, int v, int s) {
        boolean[] visited = new boolean[v]; // Correctly initialize visited array

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true; // Mark the source node as visited
        q.add(s);

        while (!q.isEmpty()) {
            int u = q.poll(); // Get the front node
            System.out.print(u + " "); // Print the node

            // Traverse all adjacent nodes of the current node
            for (int neighbor : adj.get(u)) {
                if (!visited[neighbor]) { // If the neighbor hasn't been visited
                    visited[neighbor] = true; // Mark as visited
                    q.add(neighbor); // Add to the queue
                }
            }
        }
        System.out.println(); // Move to the next line after BFS completes
    }

    public static void main(String[] args) {
        int v = 6; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);

        BFS_Practice2 bfsPractice = new BFS_Practice2();
        System.out.println("BFS starting from vertex 0:");
        bfsPractice.bfs(adj, v, 0); // Start BFS from vertex 0
    }
}
