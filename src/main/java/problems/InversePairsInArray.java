package problems;

public class InversePairsInArray {
    public int InversePairs(int [] array) {
        if (array.length <= 0) {
            return 0;
        }

        return recursive(array,0, array.length - 1);

    }

    private int recursive(int[] array, int start, int end) {
        if (start == end) {
            return 0;
        }

        int mid = start + (end - start) / 2;
        int left = recursive(array, start, mid);
        left %= 1000000007;
        int right = recursive(array,mid + 1, end);
        right %= 1000000007;

        int leftEnd = mid - start;
        int rightEnd = end - start;
        int pos = end;
        int count = 0;

        int[] temp = new int[end - start + 1];
        for (int i = 0; i < end - start + 1; i++) {
            temp[i] = array[start + i];
        }
        while (leftEnd >= 0 && rightEnd > mid - start) {
            if (temp[leftEnd] > temp[rightEnd]) {
                array[pos--] = temp[leftEnd--];
                count += rightEnd - mid + start;
                count %= 1000000007;
            } else {
                array[pos--] = temp[rightEnd--];
            }
        }

        while (leftEnd >= 0) {
            array[pos--] = temp[leftEnd--];
        }

        while (rightEnd > mid - start) {
            array[pos--] = temp[rightEnd--];
        }
        return (left + right + count) % 1000000007;
    }
}
