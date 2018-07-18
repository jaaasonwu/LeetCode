package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason Wu on 2018/7/18.
 */
public class RestoreIPAddress {
    List<String> res;
    public List<String> restoreIpAddresses(String s) {
        res = new ArrayList<>();
        subAddress(s, new StringBuilder(), 0);
        return res;

    }

    private void subAddress (String s, StringBuilder sb, int already) {
        int start = sb.length() - already;
        int len = s.length();
        if (already == 4) {
            return;
        }
        if (len - start > (4 - already) * 3) {
            return;
        }

        for (int i = 1; i <= 3; i++) {
            String next;
            if (start + i <= s.length()) {
                next = s.substring(start, start + i);
            } else {
                break;
            }
            if (i >= 2 && next.substring(0, 2).equals("00")) {
                return;
            }
            if (i >= 2 && next.charAt(0) == '0' && next.charAt(1) != '0') {
                return;
            }
            if (Integer.parseInt(next) > 255) {
                return;
            }
            sb.append(next);
            int sbLen = sb.length();
            if (already < 3) {
                sb.append(".");
                sbLen++;
            } else if (already == 3 && sbLen - 3 == len) {
                res.add(sb.toString());
            }
            subAddress(s, sb, already + 1);
            sb.setLength(already == 3 ? sbLen - i : sbLen - i - 1);
        }
    }
}
