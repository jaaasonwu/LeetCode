package problems;

import java.util.HashMap;

public class DuplicateInArray {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length == 0 || length == 1) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (numbers[i] > length - 1 || numbers[i] < 0) {
                return false;
            }
        }

        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[numbers[i]] != numbers[i]) {
                    swap(numbers, i, numbers[i]);
                } else {
                    duplication[0] = numbers[i];
                    return true;
                }
            }
        }

        return false;
    }

    private void swap (int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public boolean duplicate2(int numbers[],int length,int [] duplication) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int num = numbers[i];
            Integer freq = map.get(num);
            if (freq == null) {
                map.put(num, 1);
            } else {
                duplication[0] = num;
                return true;
            }
        }
        return false;
    }
}
