package SeleniumFucntions;


import TestNG.BaseClass;
import day7.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DropdownAndRadioBtn extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {


        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

       WebElement day = driver.findElement(By.id("day"));
       WebElement month = driver.findElement(By.id("month"));
       WebElement year =  driver.findElement(By.id("year"));
        Thread.sleep(3000);
       Generic.selectByValue(day,"18");
       Generic.selectByText(month,"Nov");
        Generic.selectByIndex(month,10);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[text()='Female']")).click();

    }
}