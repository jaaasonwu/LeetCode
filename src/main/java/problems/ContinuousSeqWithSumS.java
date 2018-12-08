package problems;

import java.util.ArrayList;

public class ContinuousSeqWithSumS {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (sum < 3) {
            return res;
        }
        int start = 1;
        int end = 2;
        int currRes = 3;

        while (start < end) {
            if (currRes == sum) {
                ArrayList<Integer> curr = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    curr.add(i);
                }
                res.add(curr);
                end++;
                currRes += end;
            } else if (currRes < sum) {
                end++;
                currRes += end;
            } else {
                currRes -= start;
                start++;
            }
        }
        return res;
    }
}
