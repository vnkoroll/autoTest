package com.company.GoogleDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class runQaFactory {
    public static void main(String[] args) throws InterruptedException  {     // throws InterruptedException - это к задержке времени

System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe"); //прописывает параметры и путь к Хроме драйверу.

        WebDriver h = new ChromeDriver(); //запускает драйвер
        h.manage().window().maximize();//на весь экран открыть браузер
        h.get("http://google.com");
        String title = h.getTitle();
        WebElement s = h.findElement(By.name("q"));
        s.sendKeys("qa factory", Keys.ENTER);
            Thread.sleep(5000); //задержка по времени 5 секунд

        WebElement rso = h.findElement(By.id("rso"));
        WebElement f = rso.findElement(By.tagName("a"));
        System.out.println (f.getText());
        List<WebElement> as = rso.findElements(By.tagName("a"));

        for (int i=0; i<as.size(); i++){
            WebElement cur = as.get(i);
            System.out.println (cur.getText());
            System.out.println (as.get(i).getAttribute("href"));
        }
        s.clear();//очистить

        s.sendKeys("angel sha1");
        h.findElement(By.name("btnG")).click();
        Thread.sleep(5000); //задержка по времени 5 секунд
        h.quit(); //закрыть Хроме



    }
}
