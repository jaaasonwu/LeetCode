package problems;

public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int i, j;
        int count = 1;
        int up = 0, left = 0, down = n - 1, right = n - 1;
        while (up <= down && left <= right) {
            i = up;
            j = left;
            // left
            while (j <= right) {
                res[i][j] = count;
                count++;
                j++;
            }
            up++;

            // down
            j--;
            i++;
            while (i <= down) {
                res[i][j] = count;
                count++;
                i++;
            }
            right--;

            // left
            i--;
            j--;
            while (j >= left) {
                res[i][j] = count;
                count++;
                j--;

            }
            down--;

            // up
            j++;
            i--;
            while (i >= up) {
                res[i][j] = count;
                count++;
                i--;

            }
            left++;
        }
        return res;
    }
}
