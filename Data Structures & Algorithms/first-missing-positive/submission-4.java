class Solution {
    public int firstMissingPositive(int[] nums) {
        // Step 1: Place each number in its correct index
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int crt=nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[crt];
                nums[crt] = temp;
            }
        }

        // Step 2: Find first index where value is incorrect
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: All numbers 1..n present
        return n + 1;
    }
}