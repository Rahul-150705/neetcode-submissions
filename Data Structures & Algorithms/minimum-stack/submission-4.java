class MinStack {
    private Stack<Integer> stk1;
    private Stack<Integer> stk2;
    public MinStack() {
        stk1=new Stack<>();
        stk2=new Stack<>();
    }
    
    public void push(int val) {
        stk1.push(val);
        if(stk2.isEmpty() || stk2.peek()>=val)
        {
            stk2.push(val);
        }
    }
    
    public void pop() {
        if(stk1.isEmpty()) return;
        int x=stk1.pop();
        if(stk2.peek()==x)
        {
            stk2.pop();
        }
    }
    
    public int top() {
        return stk1.peek();
    }
    
    public int getMin() {
        return stk2.peek();
    }
}
