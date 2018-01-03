public class Main {

    public static void main(String[] args) {
        SearchRange search = new SearchRange();
        int[] nums = new int[]{1, 2, 2};
        int[] i = search.searchRange(nums, 2);
        System.out.println(i[0]);
        System.out.println(i[1]);
    }
}
