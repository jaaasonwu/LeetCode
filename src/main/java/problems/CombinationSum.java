package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jason Wu on 2018/2/28.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<List<Integer>>> dp = new ArrayList<>();
        Arrays.sort(candidates);
        for (int i = 0; i <= target; i++) {
            List<List<Integer>> newList = new ArrayList<>();
            for (int j = 0; j < candidates.length && candidates[j] <= i; j++) {
                if (i == candidates[j]) {
                    newList.add(Arrays.asList(i));
                } else {
                    for (List<Integer> ls : dp.get(i - candidates[j])) {
                        if (candidates[j] <= ls.get(0)) {
                            List<Integer> l = new ArrayList<>();
                            l.add(candidates[j]);
                            l.addAll(ls);
                            newList.add(l);
                        }
                    }
                }
            }
            dp.add(newList);
        }
        return dp.get(target);
    }

    public List<List<Integer>> combinationSum2 (int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] candidates, int remain, int start) {
        if (remain == 0) {
            list.add(new ArrayList<>(temp));
        } else if (remain > 0) {
            for (int i = start; i < candidates.length; i++) {
                temp.add(candidates[i]);
                backtrack(list, temp, candidates, remain - candidates[i], i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
