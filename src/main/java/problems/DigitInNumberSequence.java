package problems;

public class DigitInNumberSequence {
    public int digitInSequence(int index) {
        if (index <= 9) {
            return index;
        }

        index -= 10;
        int numberOfDigits = 2;
        int numberOfNums = 90;
        while (index > numberOfDigits * numberOfNums) {
            index -= numberOfDigits * numberOfNums;
            numberOfDigits++;
            numberOfNums *= 10;
        }

        int numOffset = index / numberOfDigits;
        int num = getBase(numberOfDigits) + numOffset;
        return String.valueOf(num).charAt(index % numberOfDigits) - '0';

    }

    private int getBase(int numOfDigits) {
        StringBuilder sb = new StringBuilder();
        if (numOfDigits == 0) {
            return 0;
        }
        if (numOfDigits == 1) {
            return 1;
        }

        numOfDigits--;
        sb.append(1);
        while (numOfDigits > 0) {
            sb.append(0);
            numOfDigits--;
        }

        return Integer.valueOf(sb.toString());
    }
}
