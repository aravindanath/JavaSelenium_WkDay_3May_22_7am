package Locators;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByLinkText extends BaseClass {

    @Test
    public void byLinkText(){

        driver.get("https://www.google.co.in/");

        driver.findElement(By.linkText("Images")).click();

        driver.findElement(By.name("q")).sendKeys("Whitefield", Keys.ENTER);
    }
}
