class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,res,temp,new boolean[nums.length]);
        return res;
    }
    private void dfs(int[] nums,List<List<Integer>> res,List<Integer> temp, boolean [] pick)
    {
        if(nums.length==temp.size())
        {
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i = 0 ;i<nums.length;i++)
        {
            if(pick[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !pick[i-1]) continue;
            {
            pick[i]=true;
            temp.add(nums[i]);
            dfs(nums,res,temp,pick);
            temp.remove(temp.size()-1);
            pick[i]=false;
            }
        }
    }
}