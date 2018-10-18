package com.github.madamusinski;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for doOperation for OperationDivision.
 */
public class TestDivision
{
    /**
     * Testy jednostkowe operacji arytmetycznych
     */

    private static Operation divide;

    @BeforeClass
    public static void initOperation(){
        divide = new OperationDivision();
    }


    @After
    public void afterEachTest(){
        System.out.println("This is executed after each Test");
    }

    @Test(expected = Exception.class)
    public void testDivisionException() throws ArithmeticException {
        divide.doOperation(10.0, 0.0);
    }
    @Test
    public void testOperationAdd(){
        Double result = divide.doOperation(4.2, 2.3);

        assertEquals(1.8260869565217392, result);
    }
}
