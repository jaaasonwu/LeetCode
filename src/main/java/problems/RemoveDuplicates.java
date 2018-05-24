package problems;

/**
 * Created by Jason Wu on 2017/9/1.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 1;
        int count = 1;
        int current = nums[0];
        int newPos = 1;

        while (i < nums.length) {
            if (nums[i] > current) {
                nums[newPos] = nums[i];
                newPos++;
                current = nums[i];
                count++;
            }
            i++;
        }

        return count;
    }
}
