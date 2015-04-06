package com.company.angel.net;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by Admin on 06.04.15.
 */
public class AngelNet {
    public static void main(String[] args) {     // throws InterruptedException - это к задержке времени

        System.setProperty("webdriver.chrome.driver",
                           "C:/Automation/chromedriver.exe"); //прописывает параметры и путь к Хроме драйверу.

        WebDriver h = new ChromeDriver(); //запускает драйвер
        h.manage().window().maximize();//на весь экран открыть браузер
        h.get("http://angel.net/~nic/passwd.current.html");
        h.findElement (By.name("master")).sendKeys ("12345");
        h.findElement (By.name("site")).sendKeys ("vnkoroll@gmai.com", Keys.ENTER);
        h.findElement (By.name("password")).getAttribute("value");

        String a = h.findElement (By.name("password")).getAttribute("value"); //берем переменную с паролем

        System.out.println (a); //выводит пароль

        //проверяет правильный ли результат


        h.quit(); //закрыть Хроме







    }



}

