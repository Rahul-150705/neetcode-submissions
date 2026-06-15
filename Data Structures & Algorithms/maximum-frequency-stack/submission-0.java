class FreqStack {
    private Map<Integer, Integer> freqmap;
    private Map<Integer, Stack<Integer>> freqstk;
    private int maxfreq;
    public FreqStack() {
        freqmap=new HashMap<>();
        freqstk=new HashMap<>();
        maxfreq=0;
    }
    public void push(int val) {
        int freq=freqmap.getOrDefault(val,0)+1;
        freqmap.put(val,freq);
        if(freq>maxfreq)
        {
            maxfreq=freq;
        }
        freqstk.computeIfAbsent(freq,f-> new Stack<>()).push(val);
    }
    public int pop() {
        Stack<Integer> s=freqstk.get(maxfreq);
        int top=s.pop();
        if(s.isEmpty())
        {
            maxfreq--;
        }
        freqmap.put(top,freqmap.get(top)-1);
        return top;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */