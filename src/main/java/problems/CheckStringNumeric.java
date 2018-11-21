package problems;

public class CheckStringNumeric {
    public boolean isNumeric(char[] str) {
        if (str.length == 0) {
            return false;
        }

        int pos = 0;

        boolean firstSign = checkSign(str, pos);
        if (firstSign) pos++;

        int integerPos = checkNumeric(str, pos);
        boolean integerPart = false;
        if (checkPosRange(str, pos) && integerPos > pos) {
            integerPart = true;
            pos = integerPos;
        }

        boolean decimalPoint = false;
        boolean decimalPart = false;
        if (checkPosRange(str, pos) && str[pos] == '.') {
            decimalPoint = true;
            pos++;

            if (checkPosRange(str, pos)) {
                int decimalPos = checkNumeric(str, pos);
                if (decimalPos > pos) {
                    decimalPart = true;
                    pos = decimalPos;
                }
            }
        }


        boolean e = false;
        boolean expPart = false;
        if (checkPosRange(str, pos) && (str[pos] == 'e' || str[pos] == 'E')) {
            e = true;
            pos++;

            if (checkPosRange(str, pos)) {
                boolean secondSign = checkSign(str, pos);
                if (secondSign) pos++;

                int expPos = checkNumeric(str, pos);
                if (expPos > pos) {
                    expPart = true;
                    pos = expPos;
                }
            }
        }

        if (pos != str.length) return false;
        if (e && expPart && ((integerPart && !decimalPoint) || (decimalPart))) {
            return true;
        }

        return !e && (integerPart || decimalPart);
    }

    private int checkNumeric(char[] str, int pos) {
        while (pos < str.length && str[pos] >= '0' && str[pos] <= '9') {
            pos++;
        }

        return pos;
    }

    private boolean checkSign(char[] str, int pos) {
        return (str[pos] == '+' || str[pos] == '-');
    }

    private boolean checkPosRange(char[] str, int pos) {
        return pos < str.length;
    }
}
