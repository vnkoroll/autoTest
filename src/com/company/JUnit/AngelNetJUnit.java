package com.company.JUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by Admin on 08.04.15.
 */
@RunWith(JUnit4.class) // for import JUnit для запуска функций как тесты
public class AngelNetJUnit {
public WebDriver dr; // for @After пишем эту строку

    @Before
    public void before ()
    {
        System.setProperty("webdriver.chrome.driver",
                "C:/Automation/chromedriver.exe"); //прописывает параметры и путь к Хроме драйверу.
        dr = new ChromeDriver(); //запускает драйвер
        dr.manage().window().maximize();//на весь экран открыть браузер
        dr.get("http://angel.net/~nic/passwd.current.html");
    }

    @Test
        public void test1 (){

        String a = "12345";
        String b = "vnkoroll@gmai.com";
        dr.findElement (By.name("master")).sendKeys(a);
        dr.findElement(By.name("site")).sendKeys(b, Keys.ENTER);
        String expectedResult = "DY/QHKxH7ggdW@1a";
        String D =  dr.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals(expectedResult, D);
}
    @Test
    public void test2 (){

        String a = "";
        String b = "vnkoroll@gmai.com";
        dr.findElement (By.name("master")).sendKeys(a);
        dr.findElement(By.name("site")).sendKeys(b, Keys.ENTER);
        String expectedResult = "jJAWK+uPoeXi7@1a";
        String D =  dr.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals(expectedResult, D);
    }
@Test
public void test3 (){

        dr.findElement(By.name("site")).sendKeys(Keys.ENTER);
        String expectedResult = "BaefBs8/Z/cm2@1a";
        String D =  dr.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals(expectedResult, D);
    }
 @Test
 public void test4 (){
     String a = "1234565656565656656565656548878888848545454545a4s5a5s5a45a4s5a4d55as5as5a5s5as";
     String b = "1234565656565656656565656548878888848545454545a4s5a5s5a45a4s5a4d55as5as5a5s5as";
     dr.findElement (By.name("master")).sendKeys(a);
     dr.findElement(By.name("site")).sendKeys(b, Keys.ENTER);
     String expectedResult = "+Qv8Z2wl9tTb9@1a";
     String D =  dr.findElement(By.name("password")).getAttribute("value");
     Assert.assertEquals(expectedResult, D);
 }

    @Test
    public void test5 (){
        String a = "/:':;@#$%^&";
        String b = "/:':;@#$%^&";
        dr.findElement (By.name("master")).sendKeys(a);
        dr.findElement(By.name("site")).sendKeys(b, Keys.ENTER);
        String expectedResult = "8vR3RV/r7qCAV@1a";
        String D =  dr.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals(expectedResult, D);
    }


    @After //чтобы браузер закрылся независимо от результатов
public void quitBrowser () {
dr.quit();
}



}
