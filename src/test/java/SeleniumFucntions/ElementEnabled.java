package SeleniumFucntions;


import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class ElementEnabled extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {


        driver.get("https://courses.letskodeit.com/practice");

        driver.findElement(By.id("disabled-button")).click();

        boolean value =   driver.findElement(By.id("enabled-example-input")).isEnabled();
        System.out.println("IS element enabled? "+ value);

        driver.findElement(By.id("enabled-button")).click();

        boolean value2 =   driver.findElement(By.id("enabled-example-input")).isEnabled();
        System.out.println("IS element enabled? "+ value2);



    }
}