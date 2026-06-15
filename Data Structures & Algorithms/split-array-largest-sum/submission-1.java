class Solution {
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int max=0;
        for(int x:nums)
        {
            max=Math.max(max,x);
            sum+=x;
        }
        int left=max;
        int right=sum;
        int res=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(canSplit(nums,k,mid))
            {
                res=mid;
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return res;
    }
    private boolean canSplit(int[] nums,int r,int longest)
    {
        int subarray=1;
        int subsum=0;
        for(int num:nums)
        {
            subsum+=num;
            if(subsum>longest)
            {
                subarray+=1;
                subsum=num;
            }
        }
        return subarray<=r;
    }
}