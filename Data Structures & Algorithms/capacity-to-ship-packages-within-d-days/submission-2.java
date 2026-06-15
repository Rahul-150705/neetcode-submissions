class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int w:weights)
        {
            left=Math.max(w,left);
            right+=w;
        }
        int res=right;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(calculate(weights,days,mid) <=days)
            {
                res=Math.min(res,mid);
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return res;
        
    }
    private int calculate(int[] weights,int days,int mid)
    {
        int ships=1;
        int prefix=0;
        for(int w:weights)
        {
            prefix+=w;
            if(prefix>mid)
            {
                ships++;
                prefix=w;
            }
        }
        return ships;
    }
}