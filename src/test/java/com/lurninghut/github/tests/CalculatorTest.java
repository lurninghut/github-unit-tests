package com.lurninghut.github.tests;

import com.lurninghut.tools.Calculator;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        assert calculator.sum(4, 4) == 8;
    }
}
