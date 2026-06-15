class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp=new ArrayList<>();
        dfs(0,nums,target,res,temp);
        return res;
    }
    private void dfs(int v,int[] nums, int target,List<List<Integer>> res ,List<Integer> temp)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=v;i<nums.length;i++)
        {
            if(target-nums[i]<0)
            {
                return ;
            }
            temp.add(nums[i]);
            dfs(i,nums,target-nums[i],res,temp);
            temp.remove(temp.size()-1);
        }
    }
}