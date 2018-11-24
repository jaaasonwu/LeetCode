package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrintMatrixClockwiseTest {

    @Test
    public void printMatrix() {
        PrintMatrixClockwise pm = new PrintMatrixClockwise();
        pm.printMatrix(new int[][]{{1}, {2}, {3}, {4}, {5}});
    }
}