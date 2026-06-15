class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int num:piles)
        {
            max=Math.max(max,num); 
        }
        int left=0;
        int right=max;
        int res=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int time=0;
            for(int p:piles)
            {
                    time+=Math.ceil((double) p/mid);
            }
            if(time<=h)
            {
                right=mid-1;
                res=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return res;
    }
}
