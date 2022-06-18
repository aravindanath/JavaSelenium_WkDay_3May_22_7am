package SeleniumFucntions;


import TestNG.BaseClass;
import day7.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumFunctions extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {


        driver.get("https://www.google.com");


        driver.findElement(By.name("q")).sendKeys("Selenium Jobs", Keys.ENTER);

        Thread.sleep(4000);

        driver.navigate().to("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium Jobs", Keys.ENTER);
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.findElement(By.name("q")).sendKeys("Appium jobs",Keys.ENTER);
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();




    }
}