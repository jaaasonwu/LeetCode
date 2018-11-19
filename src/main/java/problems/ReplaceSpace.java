package problems;

public class ReplaceSpace {
    public String replaceSpace(String iniString, int length) {
        char[] arr = iniString.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
