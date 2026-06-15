class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        dfs(res,temp,s,0);
        return res;
    }
    private void dfs(List<List<String>> res,List<String> temp,String s,int v)
    {
        if(v==s.length())
        {
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=v;i<s.length();i++)
        {
            if(isPalindrome(s,v,i))
            {
                temp.add(s.substring(v,i+1));
                dfs(res,temp,s,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
