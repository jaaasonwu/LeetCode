/**
 * Created by jasonwu on 2016/8/15.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int[] numList = new int[10];
        int i, length = 0;

        if (x == Integer.MIN_VALUE || x < 0) {
            return false;
        }

        for (i = 0; i < 10; i++) {
            numList[i] = -1;
        }

        i = 0;
        while (x >= 10) {
            numList[i] = x % 10;
            x /= 10;
            length++;
            i++;
        }
        length++;
        numList[i] = x;

        for (i = 0; i < length / 2; i++) {
            if (numList[i] != numList[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
