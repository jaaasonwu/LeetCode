/**
 * Created by jasonwu on 1/1/2018.
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int left = search(nums, target, true);
        int right = search(nums, target, false);

        if (left == nums.length || nums[left] != target) {
            return new int[]{-1, -1};
        } else {
            return new int[]{left, right - 1};
        }
    }

    private int search(int[] nums, int target, boolean left) {
        int high = nums.length;
        int low = 0;
        int mid;
        while (high > low) {
            mid = (high + low) / 2;
            if (nums[mid] < target || (nums[mid] == target && !left)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
