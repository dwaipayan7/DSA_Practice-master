public class RecursionMazeProb {

    public static int countPaths(int i, int j, int n, int m){
        // If the current position is outside the grid, return 0 paths
        if (i >= n || j >= m){
            return 0;
        }
        // If the current position is the bottom-right corner, return 1 path
        if (i == n-1 && j == m-1){
            return 1;
        }

        // Recursive calls to count paths by moving down and right
        int downPaths = countPaths(i+1, j, n, m);
        int rightPaths = countPaths(i, j+1, n, m);

        // Sum of the paths from the current position
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n = 4; // Number of rows
        int m = 4; // Number of columns

        // Calculate the number of paths from the top-left corner (0, 0) to the bottom-right corner (n-1, m-1)
        int totalPaths = countPaths(0, 0, n, m);

        // Print the total number of paths
        System.out.println("Total paths from (0, 0) to (" + (n-1) + ", " + (m-1) + "): " + totalPaths);
    }
}



//Binary Search tree


