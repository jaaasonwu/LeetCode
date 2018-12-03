package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinNumberComposedOfArray {
    public String PrintMinNumber(int [] numbers) {
        ArrayList<String> lst = new ArrayList<>();

        for (int i : numbers) {
            lst.add(String.valueOf(i));
        }

        Collections.sort(lst, (s1, s2) -> {
            String comb1 = s1 + s2;
            String comb2 = s2 + s1;

            return comb1.compareTo(comb2);
        });

        StringBuilder sb = new StringBuilder();
        for (String s : lst) {
            sb.append(s);
        }
        return sb.toString();
    }
}
