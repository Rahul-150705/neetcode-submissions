class Solution {
    public int maxArea(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int area=0;
        int height=0;
        while(left<right)
        {
            int min=Math.min(nums[right],nums[left]);
            area=Math.max(area,(right-left)*min);
            if(nums[left]<nums[right])
            {
                left++;
            }
            else if(nums[right]<nums[left])
            {
                right--;
            }
            else
            {
                left++;
                right--;
            }
        }
        return area;
        
    }
}
