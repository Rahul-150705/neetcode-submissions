class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int [][] x=new int[position.length][2];
        for(int i=0;i<position.length;i++)
        {
            x[i][0]=position[i];
            x[i][1]=speed[i];
        }
        Arrays.sort(x,(a,b)->Integer.compare(b[0],a[0]));
        Stack<Double> stk=new Stack<>();
        for(int [] v:x)
        {
            stk.push((double) (target - v[0]) / v[1]);
            if(stk.size()>=2 && stk.peek()<=stk.get(stk.size()-2))
            {
                stk.pop();
            }
        }
        return stk.size();
        
    }
}
