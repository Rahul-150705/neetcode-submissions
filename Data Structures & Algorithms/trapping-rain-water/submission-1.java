class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxleft=height[left];
        int maxright=height[right];
        int water=0;
        while(left<right)
        {
            if(maxleft<maxright)
            {
                left++;
                maxleft=Math.max(height[left],maxleft);
                water+=maxleft-height[left];
                
            }
            else
            {
                right--;
                maxright=Math.max(height[right],maxright);
                water+=maxright-height[right];
                
            }
        }
        return water;
        
    }
}
