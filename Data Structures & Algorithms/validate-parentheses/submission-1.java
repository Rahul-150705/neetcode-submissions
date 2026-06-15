class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='[' || c=='{' || c=='(')
            {
                stk.push(c);
            }
            else 
            {
                if(stk.isEmpty()) return false;
                char x=stk.pop();
                if(c=='}'&& x!='{' ) return false;
                if(c==']' && x!='[' )return false;
                if(c==')' && x!='(') return false;
            }
        }
        return stk.isEmpty();  
    }
}
