package problems;

public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int start = getFirst(array, k);
        int end = getLast(array, k);
        int len = array.length;
        if (!inRange(len, start) || !inRange(len, end)) return 0;
        if (start == end && array[start] != k) return 0;
        return end - start + 1;
    }

    private boolean inRange(int len, int i) {
        return i >= 0 && i < len;
    }

    private int getFirst(int[] array, int k) {
        int start = 0;
        int end = array.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (array[mid] == k) {
                if ((mid > 0 && array[mid - 1] != k) || mid == 0) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            } else if (array[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private int getLast(int[] array, int k) {
        int start = 0;
        int end = array.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (array[mid] > k) {
                end = mid - 1;
            } else if (array[mid] < k) {
                start = mid + 1;
            } else {
                if ((mid + 1 < array.length && array[mid + 1] != k) || mid == array.length - 1) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            }
        }

        return start;
    }
}
