package problems;

import org.junit.Test;

/**
 * Created by Jason Wu on 2018/7/19.
 */
public class SetMatrixZerosTest {
    @Test
    public void setZeroes() throws Exception {
        int[][] input = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        SetMatrixZeros smz = new SetMatrixZeros();
        smz.setZeroes(input);
    }

}