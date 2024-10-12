package org.calc.test;
import org.calculator.Calculator;
import org.calculator.constants.OperationConstants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(5.0, Calculator.performACalculatorOperation(2.0, 3.0, OperationConstants.addition));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, Calculator.performACalculatorOperation(4.0, 3.0, OperationConstants.subtraction));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, Calculator.performACalculatorOperation(2.0, 3.0, OperationConstants.multiplication));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, Calculator.performACalculatorOperation(8.0, 4.0, OperationConstants.division));
    }

    @Test
    public void testDivisionByZero() {
        assertEquals(Double.POSITIVE_INFINITY, Calculator.performACalculatorOperation(8.0, 0.0, OperationConstants.division));
    }

    @Test
    public void testInvalidOperation() {
        assertEquals(-1.0, Calculator.performACalculatorOperation(2.0, 3.0, "invalid"));
    }
}
