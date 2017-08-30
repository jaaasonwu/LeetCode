import java.util.HashMap;

/**
 * Created by Jason Wu on 2017/8/30.
 */
public class RomanToInt {
    public int romanToInt(String s) {
        char[] string = s.toCharArray();
        int sum = 0;
        HashMap<Character, Integer> charValue = new HashMap<>();

        charValue.put('I', 1);
        charValue.put('V', 5);
        charValue.put('X', 10);
        charValue.put('L', 50);
        charValue.put('C', 100);
        charValue.put('D', 500);
        charValue.put('M', 1000);


        for (int i = string.length - 1; i >= 0; i--) {
            if (i >= 1) {
                if (charValue.get(string[i]) > charValue.get(string[i - 1])) {
                    sum -= 2 * charValue.get(string[i - 1]);
                }
            }
            sum += charValue.get(string[i]);
        }

        return sum;
    }
}
