package problems;

import java.util.HashMap;

public class FirstNonRepetitiveChar {
    public int FirstNotRepeatingChar(String str) {
        if (str.equals("")) {
            return -1;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        char[] arr = str.toCharArray();

        for (char c : arr) {
            map.merge(c, 1, (oldVal, newVal) -> oldVal + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) return i;
        }
        return -1;
    }
}
