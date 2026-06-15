class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,x=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            while(sum>=target)
            {
                sum-=nums[x];
                min=Math.min(min,i-x+1);
                x++;
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            return min;
        }
    }
}