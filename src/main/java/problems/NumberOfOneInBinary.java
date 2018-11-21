package problems;

public class NumberOfOneInBinary {
    public int NumberOf1(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }

        return count;
    }

    public int NumberOf12(int n) {
        int count = 0;
        int flag = 1;

        while (flag != 0) {
            if ((flag & n) != 0) {
                count++;
            }

            flag <<= 1;
        }
        return count;
    }
}
