class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        dfs(nums,res,temp,new boolean[nums.length]);
        return res;
    }
    private void dfs(int[] nums,List<List<Integer>> res,List<Integer> temp,boolean[]pick)
    {
        if(temp.size()==nums.length)
        {
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(pick[i]!=true)
            {
                temp.add(nums[i]);
                pick[i]=true;
                dfs(nums,res,temp,pick);
                temp.remove(temp.size()-1);
                pick[i]=false;
            }
        }
    }
}
