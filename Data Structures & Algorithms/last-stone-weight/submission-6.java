class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:stones)
        {
            queue.offer(x);
        }
        while(queue.size()>1)
        {
                int first=queue.poll();
                int second=queue.poll();
                if(second<first)
                {
                    queue.offer(first-second);
                }
        }
        queue.offer(0);
        return queue.peek();
        
    }
}
