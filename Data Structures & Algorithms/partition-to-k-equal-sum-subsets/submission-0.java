class Solution {
    private int target;
    private boolean[] used;
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        for(int x:nums)
        {
            sum+=x;
        }
        this.target=sum/k;
        if(sum%k!=0) return false;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<nums.length/2;i++)
        {
            int v=nums[i];
            nums[i]=nums[n-i-1];
            nums[n-i-1]=v;
        }
        used=new boolean[n];
        return backtrack(nums,k,0,0);
    }
    private boolean backtrack(int[] nums,int k,int v,int currSum)
    {
        if(k==0) return true;
        if(currSum==target) return backtrack(nums,k-1,0,0);
        for(int i=v;i<nums.length;i++)
        {
            if(used[i] || currSum+nums[i]>target ) continue;
            used[i]=true;
            if(backtrack(nums,k,i+1,currSum+nums[i])) return true;
            used[i]=false;
        }
        return false;
    }
}