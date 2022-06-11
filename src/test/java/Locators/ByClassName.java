package Locators;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByClassName extends BaseClass {

    @Test
    public void byClassName(){

        driver.get("https://www.icicibank.com/#");
       driver.findElement(By.className("ic-btn")).click();
    }
}
