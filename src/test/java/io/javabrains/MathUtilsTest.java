package io.javabrains;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testAdd(){
        MathUtils mathutils=new MathUtils();
        int expected=2;
        int actual=mathutils.add(1,1);
        assertEquals(expected,actual);
    }


    @Test
    void testComputeCircleRadius(){
        MathUtils mathutils=new MathUtils();
        assertEquals(314,mathutils.computeCircleArea(10),"should return c");
    }


    @Test
    void testDivide(){
        MathUtils mathutils=new MathUtils();
        assertEquals(314,mathutils.divide(10,0));
    }
}