package problems;

import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int H) {
        Arrays.sort(piles);
        int low = piles[0];
        int high = piles[piles.length - 1];
        int mid;

        while (low < high) {
            mid = (low + high) / 2;
            int curr = piles[mid];
            int currH = mid + 1;
            for (int i = mid + 1 ; i < piles.length; i ++) {
                currH += Math.ceil((double)piles[i] / curr);
            }
            if (currH > H) {
                low = mid + 1;
            } else if (currH < H){
                high = mid;
            }
        }

        return low;
    }
}
