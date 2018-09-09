package problems;

class RLEIterator {

    int[] nums;
    int index;
    public RLEIterator(int[] A) {
        nums = A;
        int count = 0;
        index = 0;
    }

    public int next(int n) {
        int remain = n;
        for (int i = index; i < nums.length - 1; i += 2) {
            if (nums[i] < remain) {
                remain -= nums[i];
                nums[i] = 0;
                index += 2;
                continue;
            } else {
                nums[i] -= remain;
                return nums[i + 1];
            }
        }
        return -1;
    }
}
