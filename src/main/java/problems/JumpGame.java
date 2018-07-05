package problems;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int remain = nums[0];
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (remain < nums[i]) {
                remain = nums[i];
            }

            if (i + remain >= len - 1) {
                return true;
            }

            if (remain == 0) {
                return false;
            }
            remain--;
        }
        return false;
    }
}
