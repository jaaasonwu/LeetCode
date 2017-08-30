import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jason Wu on 2017/8/30.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                int[] result = new int[2];
                result[0] = numMap.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}
