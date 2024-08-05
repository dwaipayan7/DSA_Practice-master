import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Practice {

    public static void Bfs(ArrayList<Integer>[] adj, int v, int s){

        ArrayList<Boolean> visited = new ArrayList<>(v+1);

        for (int i=0; i <= v; i++){
            visited.add(false);
        }

        Queue<Integer> q = new LinkedList<>();

        visited.set(s, true);
        q.add(s);

        while (!q.isEmpty()){
            int u = q.peek();
            q.poll();
            System.out.print(u+" ");

            for (int neighbour: adj[u]){
                if (!visited.get(neighbour)){
                    visited.set(neighbour, true);
                    q.add(neighbour);
                }
            }
        }

    }

    public static void main(String[] args) {


        int v = 5;
        ArrayList<Integer>[] adj = new ArrayList[v+1];

        for (int i = 0; i<= v; i++){
            adj[i] = new ArrayList<>();
        }

        adj[1].add(2);
        adj[1].add(3);
        adj[2].add(4);
        adj[3].add(5);

        Bfs(adj, v, 1);


    }

}
