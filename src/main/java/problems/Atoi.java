package problems;

/**
 * Created by Jason Wu on 2017/6/25.
 */
public class Atoi {
    public int myAtoi(String str) {
        char strArray[] = str.toCharArray();
        int sign = 1, base = 0, i = 0;
        if (str.equals("")) {
            return 0;
        }
        while (strArray[i] == ' ') { i++; }
        if (strArray[i] == '-' || strArray[i] == '+') {
            sign = 1 - 2 * ((strArray[i] == '-') ? 1 : 0);
            i++;
        }
        while (i <= strArray.length - 1 && strArray[i] >= '0' && strArray[i] <= '9') {
            if (base >  Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && strArray[i] - '0' > 7)) {
                if (sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            base  = 10 * base + (strArray[i++] - '0');
        }
        return base * sign;
    }
}
