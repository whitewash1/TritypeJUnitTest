package com.example.tritypejunittest;

import junit.framework.TestCase;

import org.junit.Test;

public class TritypeMutationTest extends TestCase {
    @Test
    // Test for the condition in Triang method
    public void testMutationInTriang1() {
        int res = Tritype.Triang(2, 2, 4);
        assertEquals(4, res);
    }
    @Test
    // Test for the condition in Triang method
    public void testMutationInTriang2() {
        int res = Tritype.Triang(3, 3, 5);
        assertEquals(2, res);
    }

}