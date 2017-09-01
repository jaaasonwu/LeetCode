import java.util.List;

public class Main {

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        List<List<Integer>> result;
        int nums[] = {-1, 0, 1, 2, -1, -4};
        result = ts.threeSum(nums);
        System.out.println(result);
    }
}
