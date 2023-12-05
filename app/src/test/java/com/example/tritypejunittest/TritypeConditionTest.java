package com.example.tritypejunittest;

import junit.framework.TestCase;

import org.junit.Test;

public class TritypeConditionTest extends TestCase {
/*选择line53的desision：
        if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        {
            triOut = 4;
            return (triOut);
        }
Sides1 <= 0: test case 1 : true; test case 2 : false
Sides2 <= 0: test case 1 : true; test case 2 : false
Sides3 <= 0: test case 1 : true; test case 2 : false*/
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(2, 2, 2));
        assertEquals(4, tri.Triang(0, 1, 2));
    }
}