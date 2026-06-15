class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right = 0;
        for(int p : piles) {
            right = Math.max(right, p);
        }
        int min=Integer.MAX_VALUE;
        int ans=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int time=0;
            int v=can(mid,piles,h,time);
            if(v<=h)
            {
                ans=mid;
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return ans;
    }
    public int can(int mid,int[] pile,int h,int time)
    {
        for(int i=0;i<pile.length;i++)
        {
            time+=Math.ceil((double) pile[i]/mid);
        }
        return time;
    }
}
