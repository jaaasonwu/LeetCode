package problems;

/**
 * Created by Jason Wu on 2018/7/6.
 */
public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                return i;
            }
        }
        return A.length - 1;
    }
}
