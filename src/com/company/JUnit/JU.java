package com.company.JUnit;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by Admin on 08.04.15.
 */
@RunWith(JUnit4.class) // for import JUnit для запуска функций как тесты
public class JU {
    @Test
    public void test1 (){
        Assert.fail();
    }
    @Test
    public void test2 (){
        int a = 10;
        int b = 6;
        int expectedResult = 15;
        Assert.assertEquals("Expected result didn't match", expectedResult, a + b);
    }
}
