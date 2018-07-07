package problems;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int numChars = 0;
        int numWords = 0;

        for (int i = 0; i < words.length; i++) {
            numChars += words[i].length() + (numWords == 0 ? 0 : 1);
            numWords++;

            if (i == words.length - 1) {
                result.add(leftJustify(words, i, numWords, numChars, maxWidth));
            } else if (numChars + words[i + 1].length() + 1 > maxWidth) {
                if (numWords == 1) {
                    result.add(leftJustify(words, i, numWords, numChars, maxWidth));
                } else {
                    result.add(build(words, i, numWords, numChars, maxWidth));
                }
                numChars = 0;
                numWords = 0;
            }
        }
        return result;
    }

    private String build(String[] words, int i, int numWords, int numChars, int maxWidth) {
        int extraSpace = maxWidth - numChars;
        int spacePerWord = extraSpace / (numWords - 1) + 1;
        int mod = extraSpace % (numWords - 1);
        StringBuilder sb = new StringBuilder();

        sb.append(words[i - numWords + 1]);
        for (int j = i - numWords + 2; j < i + 1; j++) {
            if (mod != 0 && j - (i - numWords + 2) < mod) {
                sb.append(" ");
            }
            appendSpace(sb, spacePerWord);
            sb.append(words[j]);
        }
        return sb.toString();
    }

    private String leftJustify(String[] words, int i, int numWords, int numChars, int maxWidth) {
        StringBuilder sb = new StringBuilder();
        int numSpaceEnd = maxWidth - numChars;
        sb.append(words[i - numWords + 1]);
        for (int j = i - numWords + 2; j < i + 1; j++) {
            sb.append(" ");
            sb.append(words[j]);
        }
        appendSpace(sb, numSpaceEnd);
        return sb.toString();
    }

    private void appendSpace(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append(" ");
        }
    }
}
