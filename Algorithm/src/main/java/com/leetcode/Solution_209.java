package com.leetcode;

public class Solution_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0, ans = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left++];
            }
            right++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
