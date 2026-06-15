class MedianFinder {
    private Queue<Integer> max; //maxHeap
    private Queue<Integer> min; //minHeap

    public MedianFinder() {
        max = new PriorityQueue<>((a, b) -> b - a);
        min = new PriorityQueue<>((a, b) -> a - b);
    }
    public void addNum(int num) {
        max.offer(num);
        if(!min.isEmpty() && max.peek()>min.peek())
        {
            min.offer(max.poll());
        }
        if(max.size()-min.size()>1)
        {
            min.offer(max.poll());
        }
        else if (min.size() > max.size()) {
            max.offer(min.poll());
        }
    }
    public double findMedian() {
        if(min.size()==max.size())
        {
            return (double)(max.peek()+min.peek())/2;
        }
        return (double) max.peek();
    }
}