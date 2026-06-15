class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;
        for (int w : weights) {
            l = Math.max(l, w);
            r += w;
        }
        int res = r;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(canship(weights,mid,days))
            {
                res=Math.min(res,mid);
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return res;
    }
    private boolean canship(int[] weights,int mid,int days)
    {
        int count=1;
        int sum=0;
        for(int x:weights)
        {
            sum+=x;
            if(sum>mid)
            {
                sum=x;
                count++;
            }
            if(count>days)
            {
                return false;
            }
        }
        return true;
    }
}