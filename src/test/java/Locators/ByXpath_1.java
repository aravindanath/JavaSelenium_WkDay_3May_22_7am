package Locators;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXpath_1 extends BaseClass {

    @Test
    public void byClassName(){

        /**
         *  Absolute xpath : /tagname/tagname
         *  Relative xpath : //tagName[@attribue='value']
         *  Relative xpath : //tagName[@attribue='value' or @attribue='value']
         *  Relative xpath : //tagName[@attribue='value' and @attribue='value']
         *  //tagName[contains(@attribue,'value')]
         *  //tagName[contains(text(),'value')]
         *  //tagName[text()='value']
         *   //tagName[startswith(text(),'value')]
         *   //following
         *   //preceding
         */





        driver.get("https://www.google.com/#");
       driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium Jobs", Keys.ENTER);
    }
}
