package com.example.tritypejunittest;

import junit.framework.TestCase;

import org.junit.Test;

public class TritypeMCDCTest extends TestCase {
    /*选择line53的desision：
        if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        {
            triOut = 4;
            return (triOut);
        }
    */
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(2, 2, 2));
        assertEquals(4, tri.Triang(-2, 2, 2));
        assertEquals(4, tri.Triang(2, -2, 2));
        assertEquals(4, tri.Triang(2, 2, -2));

    }
}