package problems;

public class MinimumNumberOfRefuelingStops {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int currFuel = startFuel;
        int currPos = 0;
        int res = 0;
        boolean[] used = new boolean[stations.length];

        if (currFuel >= target - currPos) {
            return 0;
        }

        if (stations.length == 0) {
            return -1;
        }

        int i = 0;
        currPos = startFuel;
        while (currPos < target) {
            int maxStationIndex = findMaxBefore(stations, currPos, used);
            if (maxStationIndex == -1) {
                return -1;
            } else {
                currPos += stations[maxStationIndex][1];
                used[maxStationIndex] = true;
                res += 1;
            }
        }

        return res;
    }

    private int findMaxBefore(int[][]stations, int pos, boolean[] used) {
        int max = 0;
        int maxIndex = -1;
        for (int i = 0; i < stations.length; i++) {
            if (stations[i][0] > pos) {
                break;
            }
            if (stations[i][1] > max && !used[i]) {
                max = stations[i][1];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
