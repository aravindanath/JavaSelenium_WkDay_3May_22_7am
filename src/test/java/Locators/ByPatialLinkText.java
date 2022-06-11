package Locators;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByPatialLinkText extends BaseClass {

    @Test
    public void byLinkText() throws InterruptedException {

        driver.get("https://www.amazon.in/");

        driver.findElement(By.partialLinkText("Mobil")).click();
    //    Thread.sleep(2000);
       // driver.findElement(By.name("q")).sendKeys("Whitefield", Keys.ENTER);
    }
}
