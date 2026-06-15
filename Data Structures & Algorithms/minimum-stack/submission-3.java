class MinStack {
    private Stack<Integer> stk;
    private Stack<Integer> minstk;
    private int min;
    public MinStack() {
        stk=new Stack<>();
        minstk=new Stack<>();
    }
    public void push(int val) {
        stk.push(val);
        if(minstk.isEmpty() || minstk.peek()>=val) // use or confition so that u can 
        //avoid writing again
        {
            minstk.push(val);
        }
    }
    public void pop() {
        if(stk.isEmpty()) return;  
        int top=stk.pop();
        if(top==minstk.peek()) 
        {
            minstk.pop();
        }
    }
    public int top() {
        return stk.peek();
    }
    public int getMin() {
        return minstk.peek(); // dont pop mf
    }
}
