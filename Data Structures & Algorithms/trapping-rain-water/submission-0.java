class Solution {
    public int trap(int[] height) {
        int max=height.length-1;
        int []prefix=new int[max+1];
        int []suffix=new int[max+1];
        int sum=0;
        prefix[0]=height[0];
        suffix[max]=height[max];
        for(int i=1;i<=max;i++)
        {
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        for(int i=max-1;i>=0;i--)
        {
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        for(int i=0;i<=max;i++)
        {
            sum+=Math.min(suffix[i],prefix[i])-height[i];
        }
        return sum;
    }
}
