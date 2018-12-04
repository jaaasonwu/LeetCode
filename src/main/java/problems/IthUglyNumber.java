package problems;

public class IthUglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }

        int[] arr = new int[index];
        arr[0] = 1;
        int currIndex = 1;

        int pos2 = 0, pos3 = 0, pos5 = 0;
        int curr2, curr3, curr5;

        while (currIndex < index) {
            while (arr[pos2] * 2 <= arr[currIndex - 1]) pos2++;
            curr2 = arr[pos2] * 2;
            while (arr[pos3] * 3 <= arr[currIndex - 1]) pos3++;
            curr3 = arr[pos3] * 3;
            while (arr[pos5] * 5 <= arr[currIndex - 1]) pos5++;
            curr5 = arr[pos5] * 5;

            arr[currIndex] = getLeast(curr2, curr3, curr5);
            currIndex++;
        }
        return arr[index - 1];
    }

    private int getLeast(int i1, int i2, int i3) {
        int min = Integer.MAX_VALUE;

        if (i1 < min) min = i1;
        if (i2 < min) min = i2;
        if (i3 < min) min = i3;
        return min;
    }
}
