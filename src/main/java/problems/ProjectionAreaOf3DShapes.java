package problems;

public class ProjectionAreaOf3DShapes {
    public int projectionArea(int[][] grid) {
        int numRow = grid.length;
        int numCol = grid[0].length;
        int xy = 0, yz = 0, zx = 0;
        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numCol; j++) {
                if (grid[i][j] != 0) {
                    xy++;
                }
            }
        }

        for (int i = 0; i < numRow; i++) {
            int maxHeight = 0;
            for (int j = 0; j < numCol; j++) {
                maxHeight = Math.max(maxHeight, grid[i][j]);
            }
            zx += maxHeight;
        }

        for (int i = 0; i < numCol; i++) {
            int maxHeight = 0;
            for (int j = 0; j < numRow; j++) {
                maxHeight = Math.max(maxHeight, grid[j][i]);
            }
            yz += maxHeight;
        }

        return xy + zx + yz;
    }
}
