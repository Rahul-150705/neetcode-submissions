class Solution {
    public int calPoints(String[] operations) {
        int total=0;
        Stack<Integer> stk=new Stack<>();
        for(String op:operations)
        {
            if(op.equals("+"))
            {
                int temp=stk.pop();
                int t=stk.peek()+temp;
                stk.push(temp);
                stk.push(t);
            }
            else if(op.equals("D"))
            {
                stk.push(2*stk.peek());
            }
            else if(op.equals("C"))
            {
                stk.pop();
            }
            else
            {
                stk.push(Integer.parseInt(op));
            }
        }
        while(!stk.isEmpty())
        {
            total+=stk.pop();
        }
        return total;
    }
}