package SeleniumFucntions;


import TestNG.BaseClass;
import day7.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ExampleScroll extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {


        driver.get("https://www.amazon.in/");

    Thread.sleep(4000);

     WebElement backtoTop =    driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));

     Generic.scroll(driver,backtoTop);

        Thread.sleep(4000);
        backtoTop.click();

    }
}