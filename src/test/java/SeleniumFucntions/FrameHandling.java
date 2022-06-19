package SeleniumFucntions;


import TestNG.BaseClass;
import day7.Generic;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FrameHandling extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {


        driver.get("https://docs.oracle.com/javase/7/docs/api/");

        driver.switchTo().frame("packageListFrame");

        driver.findElement(By.linkText("java.applet")).click();

        driver.switchTo().defaultContent();

        Thread.sleep(3000);

        driver.switchTo().frame("packageFrame");

        driver.findElement(By.xpath("//i[text()='AudioClip']")).click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("classFrame");

        driver.findElement(By.linkText("loop")).click();

    }
}