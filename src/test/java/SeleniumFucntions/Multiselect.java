package SeleniumFucntions;


import TestNG.BaseClass;
import day7.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Multiselect extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {


        driver.get("https://courses.letskodeit.com/practice");

        WebElement fruits  = driver.findElement(By.id("multiple-select-example"));

        Select sel = new Select(fruits);
        sel.selectByVisibleText("Apple");
        sel.selectByVisibleText("Peach");

        Thread.sleep(2000);
        sel.deselectByVisibleText("Apple");
        Thread.sleep(2000);
        sel.deselectAll();


        List<WebElement> elementList = driver.findElements(By.xpath("//select[@id='multiple-select-example']/option"));

        for (WebElement ele : elementList){
            ele.click();
        }



    }
}