package SeleniumFucntions;


import TestNG.BaseClass;
import day7.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {

        driver.get("https://www.myntra.com/");

        WebElement women =  driver.findElement(By.xpath("(//a[text()='Women'])[1]"));

        WebElement jumpSuite = driver.findElement(By.xpath("(//a[text()='Jumpsuits'])[1]"));
//        Actions act = new Actions(driver);
//        act.moveToElement(women).build().perform();
//        Thread.sleep(2000);
////        act.click(jumpSuite).build().perform();
//
//        jumpSuite.click();


        Generic.mouseHover(driver,women);
        Thread.sleep(2000);
        Generic.click(driver,jumpSuite);


    }


}
