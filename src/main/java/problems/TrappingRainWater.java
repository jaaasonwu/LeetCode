package problems;

public class TrappingRainWater {
    public int trap2(int[] height) {
        int result = 0;
        int max = -1;
        for (int h : height) {
            if (h > max) {
                max = h;
            }
        }

        int left;
        for (int i = 0; i < max; i++) {
            left = -1;
            for (int j = 0; j < height.length - 1; j++) {
                if (height[j] > i) {
                    left = j;
                }
                else if (height[j] <= i && left >= 0) {
                    int k;
                    for (k = j + 1; k < height.length; k++) {
                        if (height[k] > i) {
                            result += k - left - 1;
                            j = k;
                            left = k;
                            break;
                        }
                    }
                    if (k == height.length) {
                        break;
                    }
                }
            }
        }
        return result;
    }

    public int trap(int[] height) {
        int result = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;

        while (left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax) {
                result += leftMax - height[left];
                left++;
            } else {
                result += rightMax - height[right];
                right--;
            }
        }

        return result;
    }
}
