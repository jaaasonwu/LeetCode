package problems;

public class RotateImage {
    public void rotate (int[][] matrix) {
        int temp;
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        for (int i = 0; i < numRows - 1; i++) {
            for (int j = i + 1; j < numCols; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][numCols - 1 - j];
                matrix[i][numCols - 1 - j] = temp;
            }
        }
    }
}
