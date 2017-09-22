import java.util.ArrayList;

/**
 * Created by Jason Wu on 2017/9/21.
 */
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int len1 = nums1.length, len2 = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        while (i <= len1 && j <= len2) {
            if (i == len1) {
                for (; j < len2; j++) {
                    list.add(nums2[j]);
                }
                break;
            }

            if (j == len2) {
                for (; i < len1; i++) {
                    list.add(nums1[i]);
                }
                break;
            }
            if (nums1[i] < nums2[j]) {
                list.add(nums1[i]);
                i++;
            } else {
                list.add(nums2[j]);
                j++;
            }
        }

        int listLen = list.size();
        return listLen % 2 == 0 ? (double) (list.get(listLen / 2 - 1) + list.get(listLen / 2)) / 2
                : list.get(listLen / 2);

    }
}
