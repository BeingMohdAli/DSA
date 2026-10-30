package heaps;
import java.util.Collections;
import java.util.PriorityQueue;

public class LC295 {
    PriorityQueue<Integer> low;
    PriorityQueue<Integer> high;

    public LC295(){
        this.low = new PriorityQueue<>(Collections.reverseOrder());
        this.high = new PriorityQueue<>();
    }

    public void addNum(int num) {
        low.offer(num);
        high.offer(low.poll());
        if(high.size()>low.size()) low.offer(high.poll());
    }

    public double findMedian() {
        if (low.size()>high.size()) return (double) low.peek();
        return (double) (low.peek()+ high.peek())/2;
    }


}
