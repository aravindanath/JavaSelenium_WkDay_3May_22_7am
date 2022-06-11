package Locators;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class ByID  extends BaseClass {

    @Test
    public void byid(){

        driver.get("https://www.amazon.in");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mac Books pro", Keys.ENTER);
    }
}
