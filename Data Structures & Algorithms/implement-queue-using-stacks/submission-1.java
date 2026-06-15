class MyQueue {
    Stack<Integer>stk;
    Stack<Integer>stk1;
    public MyQueue() {
        stk=new Stack<>();
        stk1=new Stack<>();
    }
    public void push(int x) {
     stk.push(x);
    }
    public int pop() {
        if(stk1.isEmpty())
        {
         while(!stk.isEmpty())   
        {
            stk1.push(stk.pop());
        }
        }
        return stk1.pop();
    }
    public int peek() {
        if(stk1.isEmpty())
        {
         while(!stk.isEmpty())   
        {
            stk1.push(stk.pop());
        }
        }
        return stk1.peek();
    }
    
    public boolean empty() {
        return stk.isEmpty() && stk1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */