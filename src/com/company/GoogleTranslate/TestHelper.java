package com.company.GoogleTranslate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by вова on 02.05.2015.
 */
public class TestHelper {
    public static WebDriver dr;

    public static void init ()
    {
        //System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe"); //прописывает параметры и путь к Хроме драйверу.
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver"); //прописывает параметры и путь к Хроме драйверу для ДРОНА.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=ua");
        dr = new ChromeDriver(); //запускает драйвер
        dr.manage().window().maximize();//на весь экран открыть браузер
        dr.get("https://translate.google.com.ua");

    }


    }


