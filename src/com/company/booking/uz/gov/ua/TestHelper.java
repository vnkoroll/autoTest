package com.company.booking.uz.gov.ua;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Admin on 18.05.15.
 */
public class TestHelper {
    public static WebDriver dr;

    public static void init ()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe"); //прописывает параметры и путь к Хроме драйверу.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=ua");
        dr = new ChromeDriver(); //запускает драйвер
        dr.manage().window().maximize();//на весь экран открыть браузер
        dr.get("http://booking.uz.gov.ua");

    }
}
