package com.company;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target){
        int rows = matrix.length;
        int cols= matrix[0].length;

        int i= 0;
        int j = rows*cols - 1;

        while (i <= j){
            int mid = (i+j)/2;
            int row = mid/cols;
            int col = mid%cols;

            if (matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                i = mid+1;
            }
            else{
                j = mid-1;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        Search2DMatrix search2DMatrix = new Search2DMatrix();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
                };

        int target = 3;

        boolean result = search2DMatrix.searchMatrix(matrix, target);

        if (result) {
            System.out.println("Element found in the matrix.");
        } else {
            System.out.println("Element not found in the matrix.");
        }
    }

}
