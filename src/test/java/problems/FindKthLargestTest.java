package problems;

import org.junit.Test;

public class FindKthLargestTest {

    @Test
    public void findKthLargest() {
        FindKthLargest fkl = new FindKthLargest();
        int num = fkl.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println(num);
    }
}