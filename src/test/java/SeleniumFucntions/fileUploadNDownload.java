package SeleniumFucntions;


import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class fileUploadNDownload extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {


        driver.get("https://the-internet.herokuapp.com/upload");

        driver.findElement(By.id("file-upload")).sendKeys("/Users/aravindanathdm/Documents/JavaSelenium_WkDay_3May_22/Todo");

        Thread.sleep(5000);

        driver.findElement(By.id("file-submit")).click();

    }
}