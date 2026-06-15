class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,target,0,res,temp);
        return res;
    }
    private void dfs(int[] nums, int target,int v,List<List<Integer>> res,List<Integer> temp)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(temp));
        }
        if(target<0)
        {
            return ;
        }
        for(int i=v;i<nums.length;i++)
        {
            if(i!=v && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            dfs(nums,target-nums[i],i+1,res,temp);
            temp.remove(temp.size()-1);
        }

    }
}
