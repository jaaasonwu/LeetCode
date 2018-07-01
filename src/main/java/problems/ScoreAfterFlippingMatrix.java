package problems;

public class ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] A) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i][0] != 1) {
                flipRow(A, i);
            }
        }

        for (int i = 0; i < A[0].length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j][i] == 1) {
                    count++;
                }
            }
            if (count <= A.length / 2) {
                flipCol(A, i);
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result += A[i][j] * Math.pow(2, A[0].length - j - 1);
            }
        }
        return result;
    }

    public void flipRow(int[][] A, int row) {
        for (int i = 0; i < A[0].length; i++) {
            A[row][i] = A[row][i] == 1 ? 0 : 1;
        }
    }

    public void flipCol(int[][] A, int col) {
        for (int i = 0; i < A.length; i++) {
            A[i][col] = A[i][col] == 1 ? 0 : 1;
        }
    }
}
