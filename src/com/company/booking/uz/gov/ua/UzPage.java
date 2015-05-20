package com.company.booking.uz.gov.ua;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by Admin on 20.05.15.
 */
public class UzPage {

    public static void from(String cityFrom) throws InterruptedException {
        TestHelper.dr.findElement(By.xpath("//div[@id='station_from']/input")).sendKeys(cityFrom);
        Thread.sleep(1000);
        TestHelper.dr.findElement(By.xpath("//div[@id='station_from']/input")).sendKeys(Keys.ARROW_DOWN);
        TestHelper.dr.findElement(By.xpath("//div[@id='station_from']/input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        //проверка правильности введенных данных
        String expectedResult = "Киев";
        Assert.assertEquals(expectedResult, TestHelper.dr.findElement(By.xpath("//div[@id='station_from']/input")).getAttribute("value"));
    }

    public static void to (String cityTo) throws InterruptedException {
        TestHelper.dr.findElement(By.xpath("//div[@id='station_till']/input")).sendKeys(cityTo);
        Thread.sleep(1000);
        TestHelper.dr.findElement(By.xpath("//div[@id='station_till']/input")).sendKeys(Keys.ARROW_DOWN);
        TestHelper.dr.findElement(By.xpath("//div[@id='station_till']/input")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        //проверка правильности введенных данных
        String expectedResult = "Ивано-Франковск";
        TestHelper.dr.findElement(By.xpath("//div[@id='station_from']/input")).getAttribute("value");
    }







}
