class KthLargest {
    private PriorityQueue<Integer> queue;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.queue=new PriorityQueue<>();
        this.k=k;
        for(int x:nums)
        {
            queue.offer(x);
            if(queue.size()>k)
            {
                queue.poll();
            }
        }
    }
    public int add(int val) {
           queue.offer(val);
           if(queue.size()>k)
           {
            queue.poll();
           }
           return queue.peek();
    }
}
