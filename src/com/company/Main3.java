package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main3 {
    public static void main(String[] args) throws InterruptedException  {     // throws InterruptedException - это к задержке времени

System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe"); //прописывает параметры и путь к Хроме драйверу.

        WebDriver h = new ChromeDriver(); //запускает драйвер
        h.manage().window().maximize();//на весь экран открыть браузер
        h.get ("http://google.com");
        Thread.sleep(5000); //задержка по времени 5 секунд
        h.quit(); //закрыть Хроме



    }
}
