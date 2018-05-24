package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason Wu on 2017/3/21.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
        } else {
            for (int num : nums) {
                if (temp.contains(num)) {
                    continue;
                }
                temp.add(num);
                backtrack(result, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
