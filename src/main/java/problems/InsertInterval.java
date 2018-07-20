package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason Wu on 2018/7/20.
 */
public class InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        boolean inserted = false;
        int i;
        List<Interval> list = new ArrayList<>();
        for (i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.end < newInterval.start) {
                list.add(interval);
                continue;
            }
            if (interval.start > newInterval.end) {
                if (!inserted) {
                    list.add(newInterval);
                    inserted = true;
                }
                list.add(interval);
                continue;
            }

            newInterval.start = Math.min(interval.start, newInterval.start);
            newInterval.end = Math.max(interval.end, newInterval.end);
        }

        if (!inserted) {
            list.add(newInterval);
            return list;
        }

        return list;
    }
}
