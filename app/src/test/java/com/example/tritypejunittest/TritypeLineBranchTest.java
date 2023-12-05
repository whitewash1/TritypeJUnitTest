package com.example.tritypejunittest;

import junit.framework.TestCase;

import org.junit.Test;

public class TritypeLineBranchTest extends TestCase {
    @Test
    public void testType(){
        Tritype tri = new Tritype();
        assertEquals(4,tri.Triang(1,1,0));  //不能构成三角形
        assertEquals(3,tri.Triang(1,1,1));  //等边三角形
        assertEquals(2,tri.Triang(1,2,2));  //等腰三角形
        assertEquals(2,tri.Triang(2,2,1));  //等腰三角形
        assertEquals(2,tri.Triang(2,1,2));  //等腰三角形
        assertEquals(1,tri.Triang(3,4,5));  //非等腰三角形
        assertEquals(4,tri.Triang(1,1,2));  //不是三角形
        assertEquals(4,tri.Triang(1,2,3));  //不是三角形
    }

}