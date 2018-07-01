package problems;

public class LemondeChange {
    public boolean lemonadeChange(int[] bills) {
        int num5 = 0;
        int num10 = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                num5++;
            } else if (bills[i] == 10) {
                if (num5 > 0) {
                    num5--;
                    num10++;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (num10 > 0 && num5 > 0) {
                    num10--;
                    num5--;
                } else if (num5 > 2) {
                    num5 -= 3;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
