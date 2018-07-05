package problems;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        intervals.sort((interval1, interval2) -> {
            if (interval1.start < interval2.start) return -1;
            else if (interval1.start > interval2.start) return 1;
            else return 0;
        });

        List<Interval> result = new ArrayList<>();

        for (Interval interval : intervals) {
            if (result.isEmpty()) {
                result.add(interval);
                continue;
            }

            int lastIndex = result.size() - 1;
            Interval last = result.get(lastIndex);
            if (last.end >= interval.start) {
                last.end = Math.max(last.end, interval.end);
            } else {
                result.add(interval);
            }
        }
        return result;
    }
}
