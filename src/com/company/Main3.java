package com.company;

import org.openqa.selenium.WebDriver;

/**
 * Created by Admin on 30.03.15.
 */
public class Main3 {
    public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:/Automation.chromedriver.exe"); //прописывает параметры и путь к Хроме драйверу.

        WebDriver h= new CrmomeDriver ();


    }
}
