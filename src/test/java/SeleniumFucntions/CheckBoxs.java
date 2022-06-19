package SeleniumFucntions;


import TestNG.BaseClass;
import day7.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxs extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {

        driver.get("https://www.myntra.com/");

        WebElement women =  driver.findElement(By.xpath("(//a[text()='Women'])[1]"));

        WebElement jumpSuite = driver.findElement(By.xpath("(//a[text()='Jumpsuits'])[1]"));
//        Actions act = new Actions(driver);
//        act.moveToElement(women).build().perform();
//        Thread.sleep(2000);
////        act.click(jumpSuite).build().perform();
//
//        jumpSuite.click();


        Generic.mouseHover(driver,women);
        Thread.sleep(2000);
        Generic.click(driver,jumpSuite);


        Thread.sleep(3000);

        List<WebElement> brands = driver.findElements(By.xpath("//ul[@class='brand-list']/li/label"));
        Thread.sleep(3000);
        System.out.println(brands.size());

        for(WebElement element : brands){
//            System.out.println(element.getText());
            Generic.click(driver,element);

        }


    }


}
