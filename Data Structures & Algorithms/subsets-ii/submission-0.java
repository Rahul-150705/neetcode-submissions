class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp=new ArrayList<>();
        dfs(nums,res,temp,0);
        return res;
    }
    private void dfs(int[] nums,List<List<Integer>> res,List<Integer> temp,int v)
    {
        res.add(new ArrayList<>(temp));
        for(int i=v;i<nums.length;i++)
        {
            if(i>v && nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            dfs(nums,res,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
