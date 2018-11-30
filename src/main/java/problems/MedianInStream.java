package problems;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianInStream {
    int count = 0;
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer t0, Integer t1) {
            return t1 - t0;
        }
    });
    public void Insert(Integer num) {
        if ((count & 1) == 0) {
            maxHeap.offer(num);
            int max = maxHeap.poll();
            minHeap.offer(max);
        } else {
            minHeap.offer(num);
            int min = minHeap.poll();
            maxHeap.offer(min);
        }
        count++;
    }

    public Double GetMedian() {
        if ((count & 1) == 0) {
            if (!minHeap.isEmpty() && !maxHeap.isEmpty()) {
                return (double) (minHeap.peek() + maxHeap.peek()) / 2;
            } else {
                return 0.0;
            }
        } else {
            return (double) minHeap.peek();
        }
    }
}
