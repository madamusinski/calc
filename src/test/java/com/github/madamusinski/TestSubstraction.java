package com.github.madamusinski;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for doOperation for OperationSubstraction.
 */
public class TestSubstraction
{

    private static Operation substract;

    @BeforeClass
    public static void initOperation(){
        substract = new OperationSubstract();
    }


    @After
    public void afterEachTest(){
        System.out.println("This is executed after each Test");
    }

    @Test
    public void testOperationSubstraction(){
        Double result = substract.doOperation(5.0, 1.6);

        assertEquals(3.4, result);
    }
}

