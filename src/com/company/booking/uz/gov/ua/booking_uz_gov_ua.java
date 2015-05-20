package com.company.booking.uz.gov.ua;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
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
    UzPage.from("Киев");  //ввести откуда Киев
    UzPage.to("Ивано-Франковск");  //ввести куда Ивано-Франковск


    //select date
    TestHelper.dr.findElement(By.xpath("//div[@class='options']/div/label[1]/input")).click();
    Thread.sleep(1000);
    TestHelper.dr.findElement(By.xpath("//*[@class='grid']//caption[text()='Июнь 2015']/..//td[text()='20']")).click();
    Thread.sleep(1000);

    //button
    TestHelper.dr.findElement(By.xpath("//button[@name='search']")).click();
    Thread.sleep(1000);

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

    //выбираем напротив 043К купе
    TestHelper.dr.findElement(By.xpath("//div[@title='Купе']/button")).click();
    Thread.sleep(2000);
    //выбираем напротив 6 вагон
    TestHelper.dr.findElement(By.xpath("//*[@class='coaches']/a[text()='6']")).click();
    Thread.sleep(2000);
    //выбираем напротив 35 место
    TestHelper.dr.findElement(By.xpath("//*[@id='places']//span[text()='35']")).click();
    Thread.sleep(1000);
}





    @After //чтобы браузер закрылся независимо от результатов
    public void quitBrowser () {
        TestHelper.dr.quit();
    }
}
