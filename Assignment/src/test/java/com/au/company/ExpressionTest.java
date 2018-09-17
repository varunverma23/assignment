package com.au.company;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExpressionTest {
	private static final double DELTA = 1e-15;

	Expression exp = new Expression();

    @Test
    public void addsTwoNumbers() {
        assertEquals(6.9, exp.doCalculation(3.5, 3.4, "+"), DELTA);
    }

    @Test
    public void subtractsTwoNumbers() {
        assertEquals(4.0, exp.doCalculation(6.3 , 2.3, "-") , DELTA);
    }

    @Test
    public void multipliesTwoNumbers() {
        assertEquals(14.26, exp.doCalculation(6.2 , 2.3, "*") , DELTA);
    }

    @Test
    public void dividesTwoNumbers() {
        assertEquals(3.0, exp.doCalculation(6.0 , 2.0, "/") , DELTA);
    }
}
