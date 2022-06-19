package SeleniumFucntions;


import TestNG.BaseClass;
import com.google.gson.Gson;
import day7.Generic;

import org.openqa.selenium.*;

import org.testng.annotations.Test;

import java.util.List;

public class AlertsHandling extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {


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