package problems;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        boolean odd;
        int len1 = nums1.length, len2 = nums2.length;
        int total = len1 + len2;
        int current = 0;
        int prevVal = 0;
        double result = 0;


        if (total % 2 == 0) {
            odd = false;
        } else {
            odd = true;
        }

        if (len1 == 0) {
            if (odd) {
                return nums2[len2 / 2];
            } else {
                return (double) (nums2[len2 / 2 - 1] + nums2[len2 / 2]) / 2;
            }
        }

        if (len2 == 0) {
            if (odd) {
                return nums1[len1 / 2];
            } else {
                return (double) (nums1[len1 / 2 - 1] + nums1[len1 / 2]) / 2;
            }
        }

        while (current <= total / 2) {
            if (i != len1 && (j == len2 || nums1[i] < nums2[j])) {
                if (current == total / 2) {
                    result = nums1[i];
                }
                if (!odd && current == total / 2 - 1) {
                    prevVal = nums1[i];
                }
                current++;
                i++;
            } else if (i == len1 || nums1[i] >= nums2[j]) {
                if (current == total / 2) {
                    result = nums2[j];
                }
                if (!odd && current == total / 2 - 1) {
                    prevVal = nums2[j];
                }
                current++;
                j++;
            }
        }
        if (!odd) {
            result = (result + prevVal) / 2;
        }
        return result;

    }
}
