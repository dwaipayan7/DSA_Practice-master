package NewPractice;

public class NumIslands {

   static int n = 0;
   static int m = 0;

    public static int numIslands(char[][]grid){
        n = grid.length;
        m = grid[0].length;

        int count = 0;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (grid[i][j] ==  '1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(char[][]grid, int i, int j){
        if (i<0 || i>=n || j<0 || j>=m || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';

        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);

    }

    public static void main(String[] args) {

        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        int numberOfIslands = numIslands(grid);
        System.out.println("Number of islands: " + numberOfIslands);
    }


}
