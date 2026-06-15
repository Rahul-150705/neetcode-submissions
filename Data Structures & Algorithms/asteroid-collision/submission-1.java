class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk=new Stack<>();
        for(int a:asteroids)
        {
            while(!stk.isEmpty() && a<0 && stk.peek()>0)
            {
                int diff=stk.peek()+a;
                if(diff==0)
                {
                    stk.pop();
                    a=0;
                }
                else if(diff<0)
                {
                    stk.pop(); // smaller onee is explodwd
                }
                else 
                {
                    a=0; 
                }
            }
            if(a!=0)
            {
                stk.push(a);
            }
        }
        return stk.stream().mapToInt(i -> i).toArray();
    }
}