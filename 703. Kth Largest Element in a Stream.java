https://leetcode.com/problems/kth-distinct-string-in-an-array/description/?envType=daily-question&envId=2024-09-01

class KthLargest {

    PriorityQueue<Integer> pq;
    int limit = 0;

    public KthLargest(int k, int[] nums) {

        limit = k;
        pq = new PriorityQueue<>(limit);

        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > limit) {
                pq.poll();
            }
        }

    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > limit) {
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
