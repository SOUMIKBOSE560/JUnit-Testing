package org.example.testclasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleSumCalculatorTest {
    @Test
    void testSimpleCalculatorDoSumMethod(){
        SimpleSumCalculator simpleSumCalculator = new SimpleSumCalculator();

        //Now this is the actual part
        assertEquals(4,simpleSumCalculator.doSum(2,2));
    }
}