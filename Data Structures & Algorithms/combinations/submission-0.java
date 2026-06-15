class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        dfs(n,k,res,temp,1);
        return res;
    }
    private void dfs(int n,int k, List<List<Integer>> res,List<Integer> temp,int v)
    {
        if(temp.size()==k)
        {
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=v;i<=n;i++)
        {
            temp.add(i);
            dfs(n,k,res,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}