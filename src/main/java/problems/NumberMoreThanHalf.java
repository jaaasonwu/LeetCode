package problems;

import java.util.Random;

public class NumberMoreThanHalf {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        int half = len / 2;
        int start = 0;
        int end = len - 1;
        int index = partition(array, start, end);

        while (index != half) {
            if (index > half) {
                end = index - 1;
                index = partition(array, start, end);
            } else {
                start = index + 1;
                index = partition(array, start, end);
            }
        }

        if (checkMoreThanHalf(array, array[index])) {
            return array[index];
        } else {
            return 0;
        }
    }

    private int partition (int[] array, int start, int end) {
        if (start == end) {
            return start;
        }
        Random rand = new Random();
        int index = rand.nextInt(end - start + 1) + start;
        int pivot = array[index];
        swap(array, end, index);

        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, end);
        return i + 1;
    }

    private void swap (int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private boolean checkMoreThanHalf(int[] array, int target) {
        int count = 0;
        for (int i : array) {
            if (i == target) {
                count++;
            }
        }

        return (count > array.length / 2);
    }
}
