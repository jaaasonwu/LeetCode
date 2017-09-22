public class Main {

    public static void main(String[] args) {
        FindMedianSortedArrays fm = new FindMedianSortedArrays();
        int nums1[] = {1, 2, 3, 4};
        int nums2[] = {0};
        double result;
        result = fm.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
}
