package com.github.madamusinski;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for doOperation for OperationMultiply.
 */
public class TestMultiply
{
    /**
     * Testy jednostkowe operacji arytmetycznych
     */

    private static Operation multiply;

    @BeforeClass
    public static void initOperation(){
        multiply = new OperationMultiply();
    }


    @After
    public void afterEachTest(){
        System.out.println("This is executed after each Test");
    }

    @Test
    public void testOperationAdd(){
        Double result = multiply.doOperation(2.2, 2.3);

        assertEquals(5.06, result);
    }
}