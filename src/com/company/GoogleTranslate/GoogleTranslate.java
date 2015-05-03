package com.company.GoogleTranslate;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Admin on 15.04.15.
 */
@RunWith(JUnit4.class) // for import JUnit для запуска функций как тесты
public class GoogleTranslate {
    public WebDriver dr; // for @After пишем эту строку

    //прописываем функции
    //void ничего не возвращает

    public void clickButton ( ){
        TestHelper.dr.findElement(By.xpath("//*[@id='gt-lang-submit']")).click();
    }

    public String title (){
        dr.getTitle();
        return dr.getTitle();
    }
    public void RightResultBox (){
        TestHelper.dr.findElement(By.xpath("//*[@id='result_box']"));
    }

    public void LeftResultBox (){
        TestHelper.dr.findElement(By.xpath("//*[@id='gt-src-wrap']"));
    }

    String Hello = "Hello";

    public String getTextRightBox (){
        String getText1 = TestHelper.dr.findElement(By.xpath("//span[@id='result_box']//span")).getText();
        return getText1;
    }


    @Before
    public void doBefore(){
        TestHelper.init();
    }

//Просто открьіли, нажали Транслейт, проверить что результат пустой.
    @Test
         public void test1 () throws InterruptedException {
        clickButton();

        Thread.sleep(2000);
    }

//Проверить что тайтл = Google Translate.
    @Test
    public void test2 ()  {
        String expectedResult = "Переводчик Google";
        Assert.assertEquals(expectedResult, TestHelper.dr.getTitle());
    }

//5. Нажать на стрелочку язьіков проверить наличие Греческого, Мальтийского и Словацкого
    @Test
    public void test3 () throws InterruptedException {
        TestHelper.dr.findElement(By.xpath("//div[@id='gt-sl-gms']")).click();
        Thread.sleep(2000);
        TestHelper.dr.findElement(By.xpath ("//div [text()='греческий']"));
        TestHelper.dr.findElement (By.xpath ("//div [text()='мальтийский']"));
        TestHelper.dr.findElement (By.xpath ("//div [text()='словацкий']"));
    }

    //8. Слева поставить Spanish, справа English, ввести слева Hello, нажать <>, проверить что справа стало hola
    @Test
    public void test4 () throws InterruptedException {
        TestHelper.dr.findElement(By.xpath("//*[@id='gt-tl-gms']")).click();
        TestHelper.dr.findElement(By.xpath ("//div [text()='испанский']")).click();
        TestHelper.dr.findElement(By.xpath("//div[@id='gt-sl-gms']")).click();
        TestHelper.dr.findElement(By.xpath ("//div [text()='английский']")).click();
        Thread.sleep(2000);


        TestHelper.dr.findElement(By.xpath("//*[@id='source']")).sendKeys(Hello);
        clickButton();
        String ExpectedResult = "¡Hola";
        Assert.assertEquals (ExpectedResult, getTextRightBox());

        Thread.sleep(7000);

    }

    @After //чтобы браузер закрылся независимо от результатов
    public void quitBrowser () {
        TestHelper.dr.quit();
    }



}
