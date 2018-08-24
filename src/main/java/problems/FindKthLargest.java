package problems;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        int res = partition(nums, 0, nums.length - 1, nums.length - k);
        return res;
    }

    public int partition(int[] nums, int low, int high, int k) {
        int i = low;
        int j = high;
        int pivot = nums[high];
        j--;

        while (i <= j) {
            if (nums[i] > pivot) {
                swap(nums, i, j);
                i--;
                j--;
            }
            i++;
        }
        swap(nums, i, high);

        if (i > k) {
            return partition(nums, low, i - 1, k);
        } else if (i == k) {
            return nums[i];
        } else {
            return partition(nums, i + 1, high, k);
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
