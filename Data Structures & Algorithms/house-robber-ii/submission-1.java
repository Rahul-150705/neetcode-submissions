class Solution {
    public int rob(int[] nums) {
        int first=0;
        int second=0;
        if(nums.length==1)
            return nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int temp=Math.max(nums[i]+first,second);
            first=second;
            second=temp;
        }
        int third=0;
        int fourth=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int temp=Math.max(nums[i]+third,fourth);
            third=fourth;
            fourth=temp;
        }
        return Math.max(second,fourth);
    }
}
