package problems;

/**
 * Created by jasonwu on 1/3/2018.
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        int temp, temp2;
        for (int i = 0; i < len; i++) {
            while (nums[i] < len && nums[i] > 0 && nums[nums[i] - 1] != nums[i]) {
                temp = nums[i];
                temp2 = nums[nums[i] - 1];
                nums[nums[i] - 1] = temp;
                nums[i] = temp2;
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return len + 1;
    }
}
