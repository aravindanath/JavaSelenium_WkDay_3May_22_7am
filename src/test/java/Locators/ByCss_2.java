package Locators;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByCss_2 extends BaseClass {

    @Test
    public void byClassName(){

        driver.get("https://www.icicibank.com/#");
        driver.findElement(By.cssSelector(".ic-btn")).click();
    }
}
