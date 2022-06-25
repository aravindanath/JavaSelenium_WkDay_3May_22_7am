package SeleniumFucntions;


import TestNG.BaseClass;
import day7.Generic;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExampleImplecitWait   {


    @Test
    public void mouseHover() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Thread.sleep(3000);
//        Alert alert =  driver.switchTo().alert();
//
//        alert.accept();

        Generic.acceptAlert(driver);

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        Thread.sleep(3000);

        Generic.dismissAlert(driver);

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(3000);

        Generic.acceptAlert(driver,"Hello all");

        String value =   driver.findElement(By.id("result")).getText();

        System.out.println("Result: "+ value);


    }
}