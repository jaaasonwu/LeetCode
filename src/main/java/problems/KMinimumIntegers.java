package problems;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KMinimumIntegers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int start = 0;
        int end = input.length - 1;

        if (end + 1 < k || k == 0) {
            return new ArrayList<>();
        }

        int index = partition(input, start, end);
        while (index != k - 1) {
            if (index > k - 1) {
                end = index - 1;
                index = partition(input, start, end);
            } else {
                start = index + 1;
                index = partition(input, start, end);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }

    private int partition(int[] array, int start, int end) {
        if (start == end) {
            return start;
        }

        int pivot = array[end];

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

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k) {
        int end = input.length - 1;

        if (end + 1 < k || k == 0) {
            return new ArrayList<>();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for (int i : input) {
            pq.add(i);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(pq.poll());
        }

        return res;
    }
}
