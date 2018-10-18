package com.github.madamusinski;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for doOperation for OperationAdd.
 */
public class TestAddition
{
    /**
     * Testy jednostkowe operacji arytmetycznych
     */

    private static Operation add;

    @BeforeClass
    public static void initOperation(){
        add = new OperationAdd();
    }


    @After
    public void afterEachTest(){
        System.out.println("This is executed after each Test");
    }

    @Test
    public void testOperationAdd(){
        Double result = add.doOperation(6.2, 6.3);

        assertEquals(12.5, result);
    }
}
