class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;

        for (int x : nums) {
            left = Math.max(left, x); // max element
            right += x;               // sum of array
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canSplit(nums, mid) <= k) {
                right = mid;   // keep mid
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private int canSplit(int[] nums, int maxSum) {
        int count = 1; // at least one subarray
        int currSum = 0;

        for (int x : nums) {
            currSum+=x;
            if(currSum>maxSum)
            {
                currSum=x;
                count++;
            }
        }
        return count;
    }
}