package problems;

public class NumberOfOne {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n < 0) {
            n = Math.abs(n);
        }

        String num = String.valueOf(n);
        return recursive(num, 0);
    }

    private int recursive(String num, int pos) {
        int sum = 0;
        int len = num.length();
        if (len - 1 == pos) {
            if (num.charAt(pos) == '0') return 0;
            else return 1;
        }

        char first = num.charAt(pos);
        if (first == '1') {
            sum += Integer.valueOf(num.substring(pos + 1)) + 1;
        } else if (num.charAt(pos) - '0' > 1) {
            sum += powerOfTen(len - pos - 1);
        }

        sum += (first - '0') * (len - pos - 1) * powerOfTen(len - pos - 2);
        sum += recursive(num, pos + 1);
        return sum;
    }

    private int powerOfTen(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= 10;
        }
        return res;
    }
}
