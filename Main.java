public class Main {

    public static void main(String[] args) {
        FirstMissingPositive fmp = new FirstMissingPositive();
        int[] nums = new int[]{-1,4,2,1,9,10};
        int i = fmp.firstMissingPositive(nums);
        System.out.println(i);
    }
}
