package problems;

public class RobotMove {
    public int movingCount(int threshold, int rows, int cols)
    {
        if (rows < 1 || cols < 1 || threshold < 0) {
            return 0;
        }

        boolean[][] visited = new boolean[rows][cols];

        return recursive(threshold, 0, 0, rows, cols, visited);
    }

    private int recursive(int threshold, int i, int j, int rows, int cols, boolean[][] visited) {
        int count = 0;
        if (i >= 0 && i < rows && j >= 0 && j < cols && !visited[i][j]) {
            if (checkEnter(threshold, i, j)) {
                visited[i][j] = true;
                count =  1 + recursive(threshold, i - 1, j, rows, cols, visited)
                        + recursive(threshold, i, j - 1, rows, cols, visited)
                        + recursive(threshold, i + 1, j, rows, cols, visited)
                        + recursive(threshold, i, j + 1, rows, cols, visited);
            }
        }
        return count;
    }

    private boolean checkEnter(int threshold, int i, int j) {
        return calcDigitSum(i) + calcDigitSum(j) <= threshold;
    }

    private int calcDigitSum(int i) {
        int res = 0;
        while (i > 0) {
            res += i % 10;
            i /= 10;
        }

        return res;
    }
}
