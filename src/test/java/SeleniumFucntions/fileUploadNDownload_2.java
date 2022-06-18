package SeleniumFucntions;


import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class fileUploadNDownload_2 extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException, AWTException {


        driver.get("https://the-internet.herokuapp.com/upload");

        driver.findElement(By.id("file-upload")).sendKeys("/Users/aravindanathdm/Documents/JavaSelenium_WkDay_3May_22/Todo");

        Thread.sleep(5000);

        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(5000);

        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.linkText("LambdaTest.txt")).click();
        Thread.sleep(2000);
//        Robot robot = new Robot();  // Robot class throws AWT Exception
//        Thread.sleep(2000); // Thread.sleep throws InterruptedException
//        robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button
//
//        Thread.sleep(2000);  // sleep has only been used to showcase each event separately
//        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(2000);
//        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(2000);
//        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(2000);
//        robot.keyPress(KeyEvent.VK_ENTER);

    }
}