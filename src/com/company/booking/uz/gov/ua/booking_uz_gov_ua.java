package com.company.booking.uz.gov.ua;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * Created by Admin on 18.05.15.
 */
@RunWith(JUnit4.class) // for import JUnit для запуска функций как тесты

public class booking_uz_gov_ua {
    public WebDriver dr;


    @Before
    public void doBefore(){
        TestHelper.init();
    }


@Test
public void test2 () throws InterruptedException {
    //from
    TestHelper.dr.findElement(By.xpath("//div[@id='station_from']/input")).sendKeys("Кие");
    Thread.sleep(1000);
    TestHelper.dr.findElement(By.xpath("//div[@id='station_from']/input")).sendKeys(Keys.ARROW_DOWN);
    TestHelper.dr.findElement(By.xpath("//div[@id='station_from']/input")).sendKeys(Keys.ENTER);
    Thread.sleep(1000);

    //to
    TestHelper.dr.findElement(By.xpath("//div[@id='station_till']/input")).sendKeys("Ивано-Ф");
    Thread.sleep(1000);
    TestHelper.dr.findElement(By.xpath("//div[@id='station_till']/input")).sendKeys(Keys.ARROW_DOWN);
    TestHelper.dr.findElement(By.xpath("//div[@id='station_till']/input")).sendKeys(Keys.ENTER);
    Thread.sleep(1000);

    //select date
    TestHelper.dr.findElement(By.xpath("//div[@class='options']/div/label[1]/input")).click();
    Thread.sleep(1000);
    TestHelper.dr.findElement(By.xpath("//*[@class='grid']//caption[text()='Июнь 2015']/..//td[text()='20']")).click();
    Thread.sleep(1000);

    //button
    TestHelper.dr.findElement(By.xpath("//button[@name='search']")).click();
    Thread.sleep(3000);

    //смотрим что  у нас 2 результата
    TestHelper.dr.findElement(By.xpath("//*[@class='vToolsDataTableRow2']//a[text()='043 К']")).isDisplayed();
    TestHelper.dr.findElement(By.xpath("//*[@class='vToolsDataTableRow']//a[text()='143 К']")).isDisplayed();
    Thread.sleep(1000);

    //кликаем на 143К поезд смотрим что появилось окошко
    TestHelper.dr.findElement(By.xpath("//*[@class='vToolsDataTableRow']//a[text()='143 К']")).click();
    Thread.sleep(1000);
    //закрываем окно
    TestHelper.dr.findElement(By.xpath("//div[@class='vToolsPopupHeader']/a[@title='закрыть']")).click();
    Thread.sleep(1000);
}





    @After //чтобы браузер закрылся независимо от результатов
    public void quitBrowser () {
        TestHelper.dr.quit();
    }
}
