package problems;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ", 0);
        if (strs.length == 0) {
            return 0;
        }
        return strs[strs.length - 1].length();
    }
}
