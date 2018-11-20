package problems;

public class PathInMatrix {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if (matrix.length == 0 || rows < 1 || cols < 1 || str.length == 0) {
            return false;
        }

        boolean[] visited = new boolean[rows * cols];
        int length = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (findPath(matrix, i, j, rows, cols, length, str, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean findPath(char[] matrix, int i, int j, int rows, int cols, int length, char[] str, boolean[] visited) {
        if (length == str.length) {
            return true;
        }

        if (i >= 0 && i < rows && j >= 0 && j < cols && !visited[i * cols + j] && matrix[i * cols + j] == str[length]) {
            length++;
            visited[i * cols + j] = true;

            boolean hasPath = findPath(matrix, i + 1, j, rows, cols, length, str, visited)
                    || findPath(matrix, i, j + 1, rows, cols, length, str, visited)
                    || findPath(matrix, i - 1, j, rows, cols, length, str, visited)
                    || findPath(matrix, i, j - 1, rows, cols, length, str, visited);

            if (!hasPath) {
                visited[i * cols + j] = false;
            }
            return hasPath;
        }

        return false;
    }
}
