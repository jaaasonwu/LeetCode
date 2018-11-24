package problems;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrintMatrixClockwise {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();

        int height = matrix.length;
        int width = matrix[0].length;

        if (height == 0 || width == 0) {
            return null;
        }

        int circleStart = 0;
        while (circleStart * 2 < height && circleStart * 2 < width) {
            printCircle(matrix, circleStart, circleStart, res);
            circleStart++;
        }

        return res;
    }

    private void printCircle(int[][] matrix, int startRow, int startCol, ArrayList<Integer> res) {
        int width = matrix[0].length;
        int height = matrix.length;

        int endCol = width - startCol - 1;
        int endRow = height - startRow - 1;

        for (int i = startCol; i <= endCol; i++) {
            res.add(matrix[startRow][i]);
        }

        if (endRow > startRow) {
            for (int i = startRow + 1; i <= endRow; i++) {
                res.add(matrix[i][endCol]);
            }
        }

        if (endRow > startRow && endCol > startCol) {
            for (int i = endCol - 1; i >= startCol; i--) {
                res.add(matrix[endRow][i]);
            }
        }

        if (endCol > startCol && endRow > startRow + 1) {
            for (int i = endRow - 1; i > startRow; i--) {
                res.add(matrix[i][startCol]);
            }
        }
    }
}
