class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk=new Stack<>();
        for(int num:asteroids)
        {
            while(!stk.isEmpty() && num<0 && stk.peek()>0)
            {
                int diff=num+stk.peek();
                if(diff<0)
                {
                    stk.pop();
                }
                else if(diff>0)
                {
                    num=0;
                }
                else
                {
                    num=0;
                    stk.pop();
                }
            }
            if(num!=0)
            {
                stk.push(num);
            }
        }
    return stk.stream().mapToInt(i ->i).toArray();
    }
}