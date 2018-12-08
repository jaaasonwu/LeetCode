package problems;

public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length < 2) {
            num1[0] = 0;
            num2[0] = 0;
        }

        int xorResult = 0;
        for (int i : array) {
            xorResult ^= i;
        }

        int indexOfOne = findIndexOf1(xorResult);

        for (int i = 0; i < array.length; i++) {
            if (isBit1(array[i], indexOfOne)) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }

    private int findIndexOf1(int xorRes) {
        int indexBit = 0;
        while ((xorRes & 1) == 0 && indexBit < 32) {
            xorRes >>= 1;
            indexBit++;
        }

        return indexBit;
    }

    private boolean isBit1(int num, int indexBit) {
        num >>= indexBit;
        return (num & 1) == 1;
    }
}
