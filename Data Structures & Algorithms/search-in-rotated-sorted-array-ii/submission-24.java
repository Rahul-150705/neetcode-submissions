class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=right+(left-right)/2;
            if(nums[mid]==target)
            {
                return true;
            }
            else if(nums[left]<nums[mid])
            {
                if(nums[left]<=target && nums[mid]>target)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else if(nums[left]>nums[mid])
            {
                if(nums[mid]<target && nums[right]>=target)
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
            else
            {
                left++;
            }
        }
        return false;
    }
}