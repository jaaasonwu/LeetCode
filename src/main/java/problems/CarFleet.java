package problems;

/**
 * Created by Jason Wu on 2018/7/6.
 */
public class CarFleet {
    public int carFleet(int target, int[] pos, int[] spd) {
        for (int i = 0; i < pos.length; i++) {
            for (int j = i + 1; j < pos.length; j++) {
                if (pos[i] != -1 && pos[j] != -1) {
                    if (pos[i] < pos[j]) {
                        if (canCatch(target, pos[i], spd[i], pos[j], spd[j])) {
                            pos[i] = -1;
                        }
                    } else {
                        if (canCatch(target, pos[j], spd[j], pos[i], spd[i])) {
                            pos[j] = -1;
                        }
                    }
                }
            }
        }

        int count = 0;
        for (int i : pos) {
            if (i != -1) {
                count++;

            }
        }

        return count;
    }

    private boolean canCatch(int target, int pos1, int speed1, int pos2, int speed2) {
        if (speed1 > speed2) {
            int speedDiff = speed1 - speed2;
            int posDiff = pos2 - pos1;
            if ((double) posDiff / speedDiff <= (double) (target - pos2) / speed2) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

