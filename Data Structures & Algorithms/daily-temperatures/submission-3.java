class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length=temperatures.length;
        int [] res=new int[length];
        Stack<Integer> stk=new Stack<>();
        for(int i=length-1;i>=0;i--)
        {
            while(!stk.isEmpty() && temperatures[i]>=temperatures[stk.peek()])
            {
                stk.pop();
            }
            if(!stk.isEmpty())
            {
                res[i]=stk.peek()-i;
            }
            else
            {
                res[i]=0;
            }
            stk.push(i);
        }
        return res; 
    }
}
