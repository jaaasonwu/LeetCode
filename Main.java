public class Main {

    public static void main(String[] args) {
        FindMedianSortedArrays fm = new FindMedianSortedArrays();
        int nums1[] = {1, 3};
        int nums2[] = {2, 4};
        double result;
        result = fm.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
}
