package com.company;

import java.util.Arrays;

public class BellmanFord {

    public static int isNegativeWeightCycle(int n, int [][] edges){

        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        for (int count=1; count <n; count++){
            for (int j = 0; j<edges.length; j++){
                int src = edges[j][0];
                int dest = edges[j][1];
                int weight = edges[j][2];
                if (dist[src] != Integer.MAX_VALUE && dist[src] + weight < dist[dest]){
                    dist[dest] = dist[src] + weight;
                }
            }
        }

        for (int count=1; count <n; count++){
            for (int j = 0; j<edges.length; j++){
                int src = edges[j][0];
                int dest = edges[j][1];
                int weight = edges[j][2];
                if (dist[src] != Integer.MAX_VALUE && dist[src] + weight < dist[dest]){
                    return 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
            // Define the number of vertices
            int n = 5;

            // Define the edges of the graph: {source, destination, weight}
            int[][] edges = {
                    {0, 1, -1},
                    {0, 2, 4},
                    {1, 2, 3},
                    {1, 3, 2},
                    {1, 4, 2},
                    {3, 2, 5},
                    {3, 1, 1},
                    {4, 3, -3}
            };

            // Call the method to check for negative weight cycle
            int result = BellmanFord.isNegativeWeightCycle(n, edges);

            // Print the result
            if (result == 1) {
                System.out.println("The graph contains a negative weight cycle.");
            } else {
                System.out.println("The graph does not contain a negative weight cycle.");
            }
        }
    }


