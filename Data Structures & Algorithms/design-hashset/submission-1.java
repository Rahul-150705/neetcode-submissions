class MyHashSet {
    private final int size=1000;
    private List<Integer>[] set;
    public MyHashSet() {
        set=new List[size];
    }
    public int getIndex(int key)
    {
        return key%size;
    }
    public void add(int key) {
        int index=getIndex(key);
        if(set[index]==null)
        {
            set[index]=new LinkedList<>();
        }
        if(!set[index].contains(key))
        {
            set[index].add(key);
        }
    }
    public void remove(int key) {
        int index=getIndex(key);
        if(set[index]!=null)
        {
            set[index].remove(Integer.valueOf(key));
        }
    }
    public boolean contains(int key) {
        int index=getIndex(key);
        if(set[index]==null) return false;
        return set[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */