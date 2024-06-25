package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }
    @Test
    void sumMinValueTest(){
        int input = 1;
        int expected = 1;
        Assertions.assertEquals(expected, sumCalculator.sum(input));
    }

    @Test
    void sumTest(){
        int input = 3;
        int expected = 6;
        Assertions.assertEquals(expected, sumCalculator.sum(input));
    }
    @Test
    void sumIllegalArgumentTest(){
        int input = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(input));
    }

}