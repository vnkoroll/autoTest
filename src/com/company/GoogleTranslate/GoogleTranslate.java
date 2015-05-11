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
    String ukrWord = "Слава Украине!";

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

//3. Проверить наличие левого и правого полей и кнопки Транслейт.
@Test
public void test21 ()  {
    Assert.assertTrue(TestHelper.dr.findElement(By.xpath("//*[@class='gt-hl-layer short_text']")).isDisplayed()); //проверка что левое окно есть
    Assert.assertTrue(TestHelper.dr.findElement(By.xpath("//span[@id='result_box']")).isDisplayed()); //проверка что правое окно есть
    Assert.assertTrue(TestHelper.dr.findElement(By.xpath("//*[@id='gt-lang-submit']")).isDisplayed()); //проверка что кнопка есть
}


//4. Проверить что в правое поле не добавляется текст.
@Test
public void test22 ()  {
    //TestHelper.dr.get("https://google.com.ua");
            Assert.assertEquals("span", TestHelper.dr.findElement(By.xpath("//span[@id='result_box']")).getTagName());
}

//5. Нажать на стрелочку язьіков проверить наличие Греческого, Мальтийского и Словацкого
    @Test
    public void test5 () throws InterruptedException {
        TestHelper.dr.findElement(By.xpath("//div[@id='gt-sl-gms']")).click();
        Thread.sleep(2000);
        TestHelper.dr.findElement(By.xpath ("//div [text()='греческий']"));
        TestHelper.dr.findElement (By.xpath ("//div [text()='мальтийский']"));
        TestHelper.dr.findElement (By.xpath ("//div [text()='словацкий']"));
    }
//6. Ввести Hello в левое поле, нажать Translate проверить наличие кнопки прослушки.
@Test
public void test6 () throws InterruptedException {
    TestHelper.dr.findElement(By.xpath("//*[@id='source']")).sendKeys(Hello);
    //clickButton();
    Thread.sleep(2000);
    Assert.assertTrue(TestHelper.dr.findElement(By.xpath("//div[@id='gt-res-listen']")).isDisplayed()); //проверка что кнопка прослушки есть
    Thread.sleep(2000);
    TestHelper.dr.findElement(By.xpath("//div[@id='gt-res-listen']")).click(); //нажатие на кнопку прослушки
    Thread.sleep(2000);
}


//7. Открьій ссьілку https://translate.google.com/#auto/en/Hello, проверить что слева Hello, справа перевод.
@Test
public void test7 () throws InterruptedException {
/////////////////////////////////////////////////////////////////////
    Thread.sleep(2000);

}

    //8. Слева поставить Spanish, справа English, ввести слева Hello, нажать <>, проверить что справа стало hola
    @Test
    public void test8 () throws InterruptedException {
        TestHelper.dr.findElement(By.xpath("//*[@id='gt-tl-gms']")).click();
        TestHelper.dr.findElement(By.xpath ("//div [text()='испанский']")).click();
        TestHelper.dr.findElement(By.xpath("//div[@id='gt-sl-gms']")).click();
        TestHelper.dr.findElement(By.xpath ("//div [text()='английский']")).click();
        Thread.sleep(2000);


        TestHelper.dr.findElement(By.xpath("//*[@id='source']")).sendKeys(Hello);
        clickButton();
        String ExpectedResult = "¡Hola";
        Thread.sleep(3000);
        Assert.assertEquals (ExpectedResult, getTextRightBox());
        Thread.sleep(3000);

    }
//9. Вводим слева Hello, нажимаем X, проверяем что слева и справа пусто.
@Test
public void test9 () throws InterruptedException {
    TestHelper.dr.findElement(By.xpath("//*[@id='source']")).sendKeys(Hello);
    Thread.sleep(3000);
    TestHelper.dr.findElement(By.xpath ("//*[@id='gt-clear']")).click();
    Thread.sleep(3000);
 //как проверить что поля пустые????????????????????????????????????????????????????

}
// 10. Вьібираем слева Укр, справа Китайский, вводим слева С У! Г С!, проверить перевод.
@Test
public void test10 () throws InterruptedException {
    TestHelper.dr.findElement(By.xpath("//div[@id='gt-sl-gms']")).click();
    TestHelper.dr.findElement(By.xpath ("//div [text()='украинский']")).click();
    TestHelper.dr.findElement(By.xpath("//*[@id='gt-tl-gms']")).click();
    TestHelper.dr.findElement(By.xpath ("//div [text()='китайский(традиционный)']")).click();
    Thread.sleep(2000);

    TestHelper.dr.findElement(By.xpath("//*[@id='source']")).sendKeys(ukrWord);
    clickButton();
    String ExpectedResult = "光榮屬於烏克蘭！";
    Thread.sleep(3000);
    Assert.assertEquals (ExpectedResult, getTextRightBox());
    Thread.sleep(3000);

 //???????????????????????????????????????????????????????????????????????????????????

}

    @After //чтобы браузер закрылся независимо от результатов
    public void quitBrowser () {
        TestHelper.dr.quit();
    }



}
