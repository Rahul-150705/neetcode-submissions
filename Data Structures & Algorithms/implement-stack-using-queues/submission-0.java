class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    public void push(int x) {
        q.offer(x);
    }
    public int pop() {
        if(q==null) return -1;
        int size=q.size();
        while(size>1)
        {
            q.add(q.remove());
            size--;
        }
        return q.remove();
    }
    
    public int top() {
        int size=q.size();
        while(size>1)
        {
            q.add(q.remove());
            size--;
        }
        int r=q.remove();
        q.add(r);
        return r;
    }
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */