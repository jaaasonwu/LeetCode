package problems;

import java.util.*;

/**
 * Created by Jason Wu on 2018/3/2.
 */
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(candidates);
        backTrack(result, new ArrayList<>(), candidates, target, 0);

        return new ArrayList<>(result);
    }

    public void backTrack(Set<List<Integer>> result, List<Integer> temp, int[] candidates, int remain, int start) {
        if (remain == 0) {
            result.add(new ArrayList<>(temp));
        } else if (remain > 0) {
            for (int i = start; i < candidates.length; i++) {
                temp.add(candidates[i]);
                backTrack(result, temp, candidates, remain - candidates[i], i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
