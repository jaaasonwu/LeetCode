package problems;

import java.util.ArrayList;

public class MultiplyStrings {
    public String multiply2(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int l1 = num1.length();
        int l2 = num2.length();
        int totalLen = l1 + l2;

        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        char[] result = new char[totalLen];

        for (int i = l1 - 1; i >=0; i--) {
            for (int j = l2 - 1; j >= 0; j--) {
                result[i + j + 1] += Character.getNumericValue(arr1[i]) * Character.getNumericValue(arr2[j]);
            }
        }

        for (int i = totalLen - 1; i > 0; i--) {
            if (result[i] > 9) {
                result[i - 1] += result[i] / 10;
                result[i] %= 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (; ; ++i) if (result[i] != 0) break;
        for (; i < result.length; ++i) sb.append((char) (result[i] + '0'));
        return sb.toString();
    }

    public String multiply(String num1, String num2) {
        String shortStr, longStr;
        if (num1.length() <= num2.length()) {
            shortStr = num1;
            longStr = num2;
        } else {
            shortStr = num2;
            longStr = num1;
        }

        ArrayList<String> strings = new ArrayList<>();
        for (int i = shortStr.length() - 1; i >= 0; i--) {
            String result = multiplyOneDigitInverted(longStr, Character.getNumericValue(shortStr.charAt(i)));
            strings.add(addZeros(result, shortStr.length() - 1 - i));
        }

        String result = "0";
        for (String s : strings) {
            result = addTwo(s, result);
        }
        return invert(result);
    }

    public String addTwo (String s1, String s2){
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        StringBuilder sb = new StringBuilder();

        int next = 0;
        for (int i = 0; i < Math.max(s1.length(), s2.length()); i++) {
            int temp = (i < s1Arr.length ? Character.getNumericValue(s1Arr[i]) : 0)
            + (i < s2Arr.length ? Character.getNumericValue(s2Arr[i]) : 0) + next;
            sb.append(temp % 10);
            next = temp / 10;
        }
        if (next > 0) {
            sb.append(next);
        }
        return sb.toString();
    }

    // Add required number of 0s at the start of a string
    public String addZeros(String s, int numZeros) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sbForZeros = new StringBuilder();
        for (int i = 0; i < numZeros; i++) {
            sbForZeros.append('0');
        }
        sb.insert(0, sbForZeros.toString());
        return sb.toString();
    }

    public String multiplyOneDigitInverted(String longStr, int digit) {
        char[] longStrArr = longStr.toCharArray();
        StringBuilder sb = new StringBuilder();
        int next = 0;
        for (int i = longStrArr.length - 1; i >= 0; i--) {
            int temp = Character.getNumericValue(longStrArr[i]) * digit;
            sb.append((temp % 10 + next) % 10);
            next = temp / 10 + ((temp % 10 + next) >= 10 ? 1 : 0);
        }
        if (next != 0) {
            sb.append(next);
        }
        return sb.toString();
    }

    public String invert (String str) {
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();

        boolean allZeros = true;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!allZeros || arr[i] != '0') {
                sb.append(arr[i]);
                allZeros = false;
            }
        }
        if (sb.length() == 0) {
            sb.append('0');
        }
        return sb.toString();
    }
}
