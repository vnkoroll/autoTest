package com.company.JUnit;


import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Admin on 08.04.15.
 */
@RunWith(JUnit4.class) // for import JUnit для запуска функций как тесты
public class JU {
    @Test
    public void Test1 (){
        Assert.fail();
    }
    @Test
    public void Test2 (){
        int a = 10;
        int b =5;
        int expectedResult = 15;
        Assert.assertEquals(expectedResult, a+b);
    }
}
