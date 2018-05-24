package problems;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jasonwu on 2017/2/24.
 */
public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        String[] letters = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> result = new LinkedList<>();

        if (digits.length() == 0) {
            return result;
        }
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            int num = Character.getNumericValue(digits.charAt(i));
            while (result.element().length() <= i) {
                String before = result.remove();
                for (char letter : letters[num].toCharArray()) {
                    result.add(before + letter);
                }
            }
        }
        return result;
    }
}

