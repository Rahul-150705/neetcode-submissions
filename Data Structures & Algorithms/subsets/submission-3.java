class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtrack(0,nums,result,temp);
        return result;
    }
    public void backtrack(int x,int[] nums,List<List<Integer>> result,List<Integer> temp)
    {
        result.add(new ArrayList<>(temp));
        for(int i=x;i<nums.length;i++)
        {
            temp.add(nums[i]);
            backtrack(i+1,nums,result,temp);
            temp.remove(temp.size()-1);
        }
    }
}
