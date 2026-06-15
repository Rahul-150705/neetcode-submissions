class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subset(nums,ans,temp,0);
        return ans;
    }
    public void subset(int[] nums,List<List<Integer>> ans,List<Integer> temp,int i)
    {
        if(i>=nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        subset(nums,ans,temp,i+1);
        temp.remove(temp.size()-1);
        subset(nums,ans,temp,i+1);
    }
}
