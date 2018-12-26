package problems;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (map.get(sorted) == null) {
                List<String> lst = new ArrayList<>();
                lst.add(s);
                map.put(sorted, lst);
            } else {
                List<String> lst = map.get(sorted);
                lst.add(s);
                map.put(sorted, lst);
            }
        }

        List<List<String>> res = new ArrayList<>();
        Set<String> set = map.keySet();
        for (String s : set) {
            res.add(map.get(s));
        }

        return res;
    }
}
