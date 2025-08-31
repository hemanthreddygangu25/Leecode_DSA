class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int target = totalSum - x;
        if (target < 0) return -1; // Not possible

        int maxLength = -1;
        int sum = 0, start = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum > target && start <= end) {
                sum -= nums[start];
                start++;
            }

            if (sum == target) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        return (maxLength == -1) ? -1 : nums.length - maxLength;
    }
}
