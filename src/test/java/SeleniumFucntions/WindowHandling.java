package SeleniumFucntions;


import TestNG.BaseClass;
import day7.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandling extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {


        driver.get("https://canarabank.com/");

       WebElement login =  driver.findElement(By.xpath("//p[text()='LOGIN']"));
        System.out.println(driver.getTitle());
        Generic.mouseHover(driver,login);
        Thread.sleep(2000);
        WebElement netBnakin = driver.findElement(By.linkText("Net Banking - Canara"));

       String win1 =  driver.getWindowHandle();
       System.out.println("Parent window");


        Generic.click(driver,netBnakin);

       Set<String> wins =   driver.getWindowHandles();

       for(String w : wins){
           System.out.println(w);
           driver.switchTo().window(w);
       }

       System.out.println(driver.getTitle());

       driver.close();

       driver.switchTo().window(win1);

        System.out.println(driver.getTitle());



    }
}