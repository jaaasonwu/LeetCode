package problems;

import java.util.HashMap;
import java.util.LinkedList;

public class FirstNonRepetitiveInStream {
    LinkedList<Character> lst;
    HashMap<Character, Integer> map;
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if (lst == null) lst = new LinkedList<>();
        if (map == null) map = new HashMap<>();

        int newOccurance = map.merge(ch, 1, (oldVal, newVal) -> oldVal + 1);
        if (newOccurance > 1) lst.remove(Character.valueOf(ch));
        else lst.addLast(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        if (lst.peek() == null) {
            return '#';
        }
        return lst.getFirst();
    }
}
