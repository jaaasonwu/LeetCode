package problems;

public class AddBinary {
    public String addBinary(String a, String b) {
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        StringBuilder sb = new StringBuilder();

        int aIndex = aArr.length - 1;
        int bIndex = bArr.length - 1;
        int next = 0;

        while (aIndex >= 0 || bIndex >= 0) {
            int aCurr = aIndex >= 0 ? aArr[aIndex] : '0';
            int bCurr = bIndex >= 0 ? bArr[bIndex] : '0';

            int curr = aCurr + bCurr + next - 2 * '0';
            sb.append(curr % 2);
            next = curr / 2 == 1 ? 1 : 0;
            aIndex--;
            bIndex--;
        }

        if (next == 1) {
            sb.append("1");
        }

        return sb.reverse().toString();
    }
}
