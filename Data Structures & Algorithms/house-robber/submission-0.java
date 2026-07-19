class Solution {
    public int rob(int[] nums) {
        int first=0;
        int second=0;
        for(int x:nums)
        {
            int temp=Math.max(x+first,second);
            first=second;
            second=temp;
        }
        return second;
    }
}
