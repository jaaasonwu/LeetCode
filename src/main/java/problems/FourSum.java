package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        int curr = 0;
        boolean started = false;
        for (int i = 0; i < nums.length - 3; i++) {
            if (started && nums[i] == curr) continue;
            started = true;
            List<List<Integer>> temp = threeSum(nums, i + 1, target - nums[i]);
            for (List<Integer> list : temp) {
                list.add(0, nums[i]);
                result.add(list);
            }
            curr = nums[i];
        }
        return result;
    }

    public List<List<Integer>> threeSum(int[] num, int start, int target) {
        List<List<Integer>> res = new LinkedList<>();
        for (int i = start; i < num.length-2; i++) {
            if (i == start || (i > start && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = target - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(new ArrayList<>(Arrays.asList(num[i], num[lo], num[hi])));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}
