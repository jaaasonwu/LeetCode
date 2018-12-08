package problems;

import java.util.ArrayList;

public class TwoNumWithSumS {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if (array.length < 2) {
            return res;
        }
        int start = 0;
        int end = array.length - 1;
        int currSum;


        while (start < end) {
            currSum = array[start] + array[end];
            if (currSum > sum) end--;
            else if (currSum < sum) start++;
            else {
                res.add(array[start]);
                res.add(array[end]);
                return res;
            }
        }
        return res;
    }
}
