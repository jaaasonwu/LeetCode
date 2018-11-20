package problems;

public class SpinArrayMinimum {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if (len == 0) {
            return -1;
        }
        int low = 0;
        int high = len - 1;
        int mid;

        while (low < high - 1) {
            mid = (low + high) / 2;
            if (array[mid] >= array[low]) {
                low = mid;
            } else if (array[mid] < array[high]) {
                high = mid;
            }
        }
        return array[high];
    }
}
