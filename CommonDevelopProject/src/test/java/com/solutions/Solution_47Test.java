package com.solutions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Solution_47Test {

    @Test
    public void testPermuteUnique() {
        Solution_47 solution_47 = new Solution_47();
        System.out.println(solution_47.permuteUnique(new int[]{1,1,3}));
    }
}