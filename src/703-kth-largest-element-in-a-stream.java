import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {
    final PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.naturalOrder());
    final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i:nums)
            add(i);
    }

    public int add(int val) {
        if (heap.size()<k)
            heap.offer(val);
        else if (val>heap.peek()) {
            heap.poll();
            heap.add(val);
        }
        return heap.peek();
    }
}
