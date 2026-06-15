class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=nums.length+1;
        int x=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            while(sum>=target)
            {
                min=Math.min(min,i-x+1);
                sum-=nums[x];
                x++;
            }
        }
        return min == nums.length+1 ? 0 : min;
    }
}