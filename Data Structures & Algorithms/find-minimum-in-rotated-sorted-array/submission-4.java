class Solution { // this is the method to find pivot index
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int res=0;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[right]) // it shows that its not in right side of array 
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return nums[left];
    }
}
