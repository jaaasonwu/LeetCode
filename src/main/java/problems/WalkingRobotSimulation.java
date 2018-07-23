package problems;

import java.util.Arrays;

public class WalkingRobotSimulation {
    public int robotSim(int[] commands, int[][] obstacles) {
        int dir = 0; // 0 up, 1 right, 2 down, 3 left
        int posx = 0;
        int posy = 0;
        int[][] xS = obstacles;
        int[][] yS = obstacles;
        Arrays.sort(xS, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(yS, (a, b) -> Integer.compare(a[1], b[1]));

        int[] queryX = new int[xS.length];
        for (int i = 0; i < xS.length; i++) {
            queryX[i] = xS[i][0];
        }

        int[] queryY = new int[yS.length];
        for (int i = 0; i < yS.length; i++) {
            queryY[i] = yS[i][1];
        }


        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == -1) {
                dir = (dir + 1) % 4;
                continue;
            }

            if (commands[i] == -2) {
                dir = (dir + 3) % 4;
                continue;
            }

            if (dir == 0) {
                int search = Arrays.binarySearch(queryX, posx);
                if (search < 0) {
                    posy += commands[i];
                    continue;
                } else {
                    int off = 0;
                    int minObs = Integer.MAX_VALUE;
                    while (search + off < yS.length && xS[search + off][0] == posx && xS[search + off][1] >= posy && xS[search + off][1] <= posy + commands[i]) {
                        minObs = Math.min(minObs, xS[search + off][1]);
                        off++;
                    }
                    if (minObs != Integer.MAX_VALUE) {
                        posy = minObs - 1;
                    }

                }
            }

            if (dir == 1) {
                int search = Arrays.binarySearch(queryY, posy);
                if (search < 0) {
                    posx += commands[i];
                    continue;
                } else {
                    int off = 0;
                    int minObs = Integer.MAX_VALUE;
                    while (search + off < yS.length && yS[search + off][1] == posy &&
                            yS[search + off][0] >= posx && yS[search + off][0] <= posx + commands[i]) {
                        minObs = Math.min(minObs, yS[search + off][0]);
                        off++;
                    }
                    if (minObs != Integer.MAX_VALUE) {
                        posx = minObs - 1;
                    }

                }
            }
            if (dir == 2) {
                int search = Arrays.binarySearch(queryX, posx);
                if (search < 0) {
                    posy -= commands[i];
                    continue;
                } else {
                    int off = 0;
                    int maxObs = Integer.MIN_VALUE;
                    while (search + off < yS.length && xS[search + off][0] == posx && xS[search + off][1] <= posy && xS[search + off][1] >= posy - commands[i]) {
                        maxObs = Math.max(maxObs, xS[search + off][1]);
                        i++;
                    }
                    if (maxObs != Integer.MAX_VALUE) {
                        posy = maxObs + 1;
                    }

                }
            }
            if (dir == 4) {
                int search = Arrays.binarySearch(queryY, posy);
                if (search < 0) {
                    posx -= commands[i];
                    continue;
                } else {
                    int off = 0;
                    int maxObs = Integer.MIN_VALUE;
                    while (search + off < yS.length && yS[search + off][1] == posy && yS[search + off][0] <= posx && yS[search + off][0] >= posx + commands[i]) {
                        maxObs = Math.max(maxObs, yS[search + off][0]);
                        off++;
                    }
                    if (maxObs != Integer.MIN_VALUE) {
                        posx = maxObs + 1;
                    }

                }
            }
        }
        return posx * posx + posy * posy;
    }
}
