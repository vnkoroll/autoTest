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
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 15.04.15.
 */
@RunWith(JUnit4.class) // for import JUnit для запуска функций как тесты
public class oxogamestudio {
    public WebDriver dr; // for @After пишем эту строку

    //прописываем функции
    //void ничего не возвращает
    public void setMaster (String setM){
        dr.findElement (By.name("master")).sendKeys(setM);
    }

    public void setName (String setN){
        dr.findElement(By.name("site")).sendKeys(setN, Keys.ENTER);
    }

    public String getPassword(){
        String getPass =  dr.findElement(By.name("password")).getAttribute("value");
        return getPass;
    }

    @Before
    public void before ()
    {
        System.setProperty("webdriver.chrome.driver",
                "C:/Automation/chromedriver.exe"); //прописывает параметры и путь к Хроме драйверу.
        dr = new ChromeDriver(); //запускает драйвер
        dr.manage().window().maximize();//на весь экран открыть браузер
        dr.get("http://oxogamestudio.com/passwd.current2.htm");
    }

    @Test
    public void test1 (){

        //String a = "12345";
        //String b = "vnkoroll@gmai.com";
        setMaster("12345");
        setName("vnkoroll@gmai.com");
        //dr.findElement (By.name("master")).sendKeys(a);
        //dr.findElement(By.name("site")).sendKeys(b, Keys.ENTER);
        String expectedResult = "DY/QHKxH7ggdW@1a";
        //String D =  dr.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals(expectedResult, getPassword());
    }
    @Test
    public void test2 (){

        //String a = "";
        setMaster("");
        setName("vnkoroll@gmai.com");
        //String b = "vnkoroll@gmai.com";
        //dr.findElement (By.name("master")).sendKeys(a);
        //dr.findElement(By.name("site")).sendKeys(b, Keys.ENTER);
        String expectedResult = "jJAWK+uPoeXi7@1a";
        //String D =  dr.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals(expectedResult, getPassword());
    }
    @Test
    public void test3 (){
        setName ("");
        //dr.findElement(By.name("site")).sendKeys(Keys.ENTER);
        String expectedResult = "BaefBs8/Z/cm2@1a";
        //String D =  dr.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals(expectedResult, getPassword());
    }
    @Test
    public void test4 (){
        //String a = "1234565656565656656565656548878888848545454545a4s5a5s5a45a4s5a4d55as5as5a5s5as";
        setMaster("1234565656565656656565656548878888848545454545a4s5a5s5a45a4s5a4d55as5as5a5s5as");
        setName("1234565656565656656565656548878888848545454545a4s5a5s5a45a4s5a4d55as5as5a5s5as");
        //String b = "1234565656565656656565656548878888848545454545a4s5a5s5a45a4s5a4d55as5as5a5s5as";
        //dr.findElement (By.name("master")).sendKeys(a);
        //dr.findElement(By.name("site")).sendKeys(b, Keys.ENTER);
        String expectedResult = "+Qv8Z2wl9tTb9@1a";
        //String D =  dr.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals(expectedResult, getPassword());
    }

    @Test
    public void test5 (){
        setMaster("/:':;@#$%^&");
        //String a = "/:':;@#$%^&";
        setName("/:':;@#$%^&");
        //String b = "/:':;@#$%^&";
        //dr.findElement (By.name("master")).sendKeys(a);
        //dr.findElement(By.name("site")).sendKeys(b, Keys.ENTER);
        String expectedResult = "8vR3RV/r7qCAV@1a";
        //String D =  dr.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals(expectedResult, getPassword());
    }
    @Test
    public void test6 (){
        int i=0;
        for (i=0; i<200; i++){
            setMaster("1");
            setName("1");
        }
        String expectedResult = "aR8ztwNBbSqe5@1a";
        Assert.assertEquals(expectedResult, getPassword());
    }

    @After //чтобы браузер закрылся независимо от результатов
    public void quitBrowser () {
        dr.quit();
    }



}
