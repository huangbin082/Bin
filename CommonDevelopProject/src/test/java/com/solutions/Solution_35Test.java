package com.solutions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Solution_35Test {

    @Test
    public void testSearchInsert() {
        Solution_35 solution_35 = new Solution_35();
        System.out.println(solution_35.searchInsert(new int[]{1,3,5,6},2));
    }
}