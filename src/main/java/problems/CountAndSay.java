package problems;

public class CountAndSay {
    public String countAndSay(int n) {
        String result = "1";
        int count = 0;
        StringBuilder newResult;
        for (int i = 1; i < n; i++) {
            newResult = new StringBuilder();
            int j = 0;
            while (j < result.length()) {
                int curr = Character.getNumericValue(result.charAt(j));
                while (j < result.length() && curr == Character.getNumericValue(result.charAt(j))) {
                    count++;
                    j++;
                }
                newResult.append(count);
                newResult.append(curr);
                count = 0;
            }
            result = newResult.toString();
        }

        return result;
    }
}
