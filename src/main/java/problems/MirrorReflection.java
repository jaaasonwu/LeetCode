package problems;

public class MirrorReflection {
    public int mirrorReflection(int p, int q) {
        if (p % 2 == 0 && q % 2 == 0) {
            p = p << 1;
            q = q << 1;
        }

        if (p % 2 == 0) {
            return 2;
        } else if (q % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
