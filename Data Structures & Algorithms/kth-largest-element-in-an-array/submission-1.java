class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int x:nums)
        {
            queue.offer(x);
            if(queue.size()>k)
            {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
