class MedianFinder {
    private Queue<Integer> max; //maxHeap
    private Queue<Integer> min; //minHeap

    public MedianFinder() {
        max = new PriorityQueue<>((a, b) -> b - a);
        min = new PriorityQueue<>((a, b) -> a - b);
    }
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if(min.size() > max.size())
        {
            max.offer(min.poll());
        }
    }
    public double findMedian() {
        if(min.size()==max.size())
        {
            return (double)(max.peek()+min.peek())/2;
        }
        else if(min.size()>max.size())
        {
            return (double)min.peek();
        }
        else
        {
            return (double) max.peek();
        }
    }
}