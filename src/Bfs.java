import java.util.ArrayList;
import java.util.LinkedList;

public class Bfs {

    public static boolean bfs(ArrayList<ArrayList<Integer>> adj,
                              int src, int dest, int v, int[] pred, int[] dist) {
        LinkedList<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()) {
            int cur = queue.remove();

            for (int i = 0; i < adj.get(cur).size(); i++) {
                int neighbor = adj.get(cur).get(i);
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    dist[neighbor] = dist[cur] + 1;
                    pred[neighbor] = cur;
                    queue.add(neighbor);
                    if (neighbor == dest) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int v = 6;

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
//        int v = 6;
//        int e = 8;

//        int pred[] = new int[v+1];
//        int dist[] = new int[v+1];

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(1);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(3).add(5);
        adj.get(4).add(2);
        adj.get(4).add(5);
        adj.get(5).add(3);
        adj.get(5).add(4);

        int[] pred = new int[v];
        int[] dist = new int[v];

        int src = 0, dest = 5;
        if (bfs(adj, src, dest, v, pred, dist)) {
            System.out.println("Shortest path length is: " + dist[dest]);

        // For searching the minimum distance
//        int isReached = bfs(adj, 1, 6, );

            // Printing path from source to destination
            LinkedList<Integer> path = new LinkedList<>();
            int crawl = dest;
            path.add(crawl);
            while (pred[crawl] != -1) {
                path.add(pred[crawl]);
                crawl = pred[crawl];
            }

            System.out.print("Path is : ");
            for (int i = path.size() - 1; i >= 0; i--) {
                System.out.print(path.get(i) + " ");
            }
        } else {
            System.out.println("Given source and destination are not connected");
        }

    }
}
