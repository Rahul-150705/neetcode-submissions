class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>(); 
        stack.push(n-1);
        ans[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            int x=temperatures[i];
            while(!stack.isEmpty() && x>=temperatures[stack.peek()])
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                ans[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return ans;
        
    }
}
