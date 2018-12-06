package problems;

public class FindMissingNumber {
    public int getMissing(int[] numbers) {
        int len = numbers.length;
        if (len == 0) {
            return 0;
        }
        int start = 0;
        int end = len - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (numbers[mid] > mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
