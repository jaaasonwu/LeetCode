package problems;

import java.util.*;

public class VowelSpellchecker {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        HashMap<String, String> lower = new HashMap<>();
        HashMap<String, String> vowel = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(wordlist));
        ArrayList<String> res = new ArrayList<>();

        for (String s : wordlist) {
            String lowerStr = s.toLowerCase();
            lower.putIfAbsent(lowerStr, s);
            String vowelStr = lowerStr.replaceAll("[aeiou]", "*");
            vowel.putIfAbsent(vowelStr, s);
        }

        for (int i = 0; i < queries.length; i++) {
            if (set.contains(queries[i])) {
                continue;
            }
            String lowerStr = queries[i].toLowerCase();
            String vowelStr = lowerStr.replaceAll("[aeiou]", "*");
            if (lower.containsKey(lowerStr)) {
                queries[i] = lower.get(lowerStr);
            } else if (vowel.containsKey(vowelStr)) {
                queries[i] = vowel.get(vowelStr);
            } else queries[i] = "";
        }

        return queries;
    }
}
