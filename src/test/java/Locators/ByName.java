package Locators;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByName extends BaseClass {

    @Test
    public void byName(){

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Mac Books pro", Keys.ENTER);
    }
}
