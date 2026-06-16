class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char r=s.charAt(i);
            if(r=='(' || r=='[' || r=='{')
            {
                stk.push(r);
            }
            else
            {
                if(stk.isEmpty())
                {
                    return false;
                }
                else
                {
                    if(r=='}' && stk.peek()!='{') return false;
                    if(r==']' && stk.peek()!='[') return false;
                    if(r==')' && stk.peek()!='(') return false;
                }
                stk.pop();
            }
        }
        return stk.isEmpty();
        
    }
}
