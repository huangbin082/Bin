package com.solutions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Solution_189Test {

    @Test
    public void testRotate() {
        Solution_189 solution_189 = new Solution_189();
        solution_189.rotate(new int[]{1,2,3,4,5,6,7},3);
    }
}