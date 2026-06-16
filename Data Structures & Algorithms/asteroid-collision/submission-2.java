class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk=new Stack<>();
        for(int x:asteroids)
        {
            while(!stk.isEmpty() && x<0 && stk.peek()>0)
            {
                int diff=x+stk.peek();
                if(diff<0)
                {
                    stk.pop();
                }
                else if(diff>0)
                {
                    x=0;
                }
                else
                {
                    x=0;
                    stk.pop();
                }
            }
            if(x!=0)
            {
                stk.push(x);
            }
        }
        return stk.stream().mapToInt(i->i).toArray();
    }
}