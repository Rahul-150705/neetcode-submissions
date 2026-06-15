class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]>stk=new Stack<>();
        int[] res=new int[temperatures.length];
        Arrays.fill(res,0);
        for(int i=temperatures.length-1;i>=0;i--)
        {
            int t=temperatures[i];
            while(!stk.isEmpty() && t>=stk.peek()[1])
            {
                stk.pop();
            }
            if(!stk.isEmpty())
            {
                res[i]=stk.peek()[0]-i;
            }
            stk.push(new int[]{i,temperatures[i]});
        }
        return res;
    }
}
