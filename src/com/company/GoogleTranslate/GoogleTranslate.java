package com.company.GoogleTranslate;

import com.thoughtworks.selenium.webdriven.commands.Click;
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
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Admin on 15.04.15.
 */
@RunWith(JUnit4.class) // for import JUnit для запуска функций как тесты
public class GoogleTranslate {
    public WebDriver dr; // for @After пишем эту строку

    //прописываем функции
    //void ничего не возвращает

    public void clickButton ( ){
        dr.findElement(By.xpath("//*[@id='gt-lang-submit']")).click();
    }

    public String title (){
        dr.getTitle();
        return dr.getTitle();

    }

    @Before
    public void before ()
    {
        System.setProperty("webdriver.chrome.driver",
                "C:/Automation/chromedriver.exe"); //прописывает параметры и путь к Хроме драйверу.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        dr = new ChromeDriver(); //запускает драйвер
        dr.manage().window().maximize();//на весь экран открыть браузер
        dr.get("https://translate.google.com");
    }

    @Test
    public void test1 () throws InterruptedException {
        clickButton();

        Thread.sleep(5000);
    }

    @Test
    public void test2 ()  {
        String expectedResult = "Переводчик Google";
        Assert.assertEquals(expectedResult, dr.getTitle());
    }


    @After //чтобы браузер закрылся независимо от результатов
    public void quitBrowser () {
        dr.quit();
    }



}
