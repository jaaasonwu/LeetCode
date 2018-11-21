package problems;

public class Power {
    public double Power(double base, int exponent) {
        Double baseDouble = base;
        if (exponent == 0) {
            return 1.0;
        }

        if (baseDouble.equals(0.0)) {
            return 0.0;
        }

        int exponentAbs = Math.abs(exponent);
        double res = base;
        exponentAbs -= 1;

        while (exponentAbs > 0) {
            if ((exponentAbs & 1) == 1) {
                exponentAbs--;
                res *= base;
            } else {
                exponentAbs >>= 1;
                res *= res;
            }
        }

        if (exponent < 0) {
            res = 1 / res;
        }

        return res;
    }
}
