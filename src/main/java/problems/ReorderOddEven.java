package problems;

public class ReorderOddEven {
    public void reOrderArray2(int [] array) {
        if (array.length == 0) {
            return;
        }
        int left = 0, right = array.length - 1;

        while (left < right) {
            while(left < right && (array[left] & 1) != 0) left++;

            while (left < right && (array[right] & 1) == 0) right--;

            if (left < right) {
                swap(array, left, right);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // To ensure the relative position does not change
    public void reOrderArray(int[] array) {
        int[] res = new int[array.length];
        int count = 0;

        for (int i : array) {
            if ((i & 1) == 1) {
                res[count] = i;
                count++;
            }
        }

        for (int i : array) {
            if ((i & 1) == 0) {
                res[count] = i;
                count++;
            }
        }

        System.arraycopy(res, 0, array, 0, array.length);
    }
}
