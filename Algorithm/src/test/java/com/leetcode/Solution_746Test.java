package com.leetcode;

import org.testng.annotations.Test;

public class Solution_746Test {

    @Test
    public void testMinCostClimbingStairs() {
        Solution_746 solution_746 = new Solution_746();
        System.out.println(solution_746.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}