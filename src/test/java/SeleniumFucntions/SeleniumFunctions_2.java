package SeleniumFucntions;


import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumFunctions_2 extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {


        driver.get("https://www.google.com");


       WebElement search =  driver.findElement(By.name("q"));

       System.out.println("Is enabled " + search.isEnabled());
        System.out.println("Is dispay " + search.isDisplayed());


    }
}