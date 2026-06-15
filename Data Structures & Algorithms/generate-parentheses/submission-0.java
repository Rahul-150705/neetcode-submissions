class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        backtrack(n,0,0,res,sb);
        return res;
    }
    private void backtrack(int n,int open,int closed,List<String> res,StringBuilder sb)
    {
        if(open==closed && open==n)
        {
            res.add(sb.toString());
            return ;
        }
        if(open<n)
        {
            sb.append('(');
            backtrack(n,open+1,closed,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(closed<open)
        {
            sb.append(')');
            backtrack(n,open,closed+1,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
