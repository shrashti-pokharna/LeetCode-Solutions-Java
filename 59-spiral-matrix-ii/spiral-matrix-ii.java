class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int top = 0;
        int right = cols - 1;
        int bottom = rows - 1;
        int number = 1;

        while (left <= right && top <= bottom && number <= n * n) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = number;
                number++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = number;
                number++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = number;
                    number++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = number;
                    number++;
                }
                left++;
            }

        }
        return matrix;

    }

}