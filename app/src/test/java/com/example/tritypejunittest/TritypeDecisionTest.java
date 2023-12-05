package com.example.tritypejunittest;

import junit.framework.TestCase;

public class TritypeDecisionTest extends TestCase {
    /* 选择line53的desision：
        if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        {
            triOut = 4;
            return (triOut);
        }
test case 1: (Side1 <= 0 || Side2 <= 0 || Side3 <= 0) = true
test case 2: (Side1 <= 0 || Side2 <= 0 || Side3 <= 0) = false*/

    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(0, 1, 2));
        assertEquals(3, tri.Triang(2, 2, 2));
    }
}