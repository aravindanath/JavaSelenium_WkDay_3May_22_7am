package Locators;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXpath_9 extends BaseClass {

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





        driver.get("https://the-internet.herokuapp.com/tables");

        String commodity [] ={"Jason","Tim","John"};
        for(String com : commodity) {
            String xpath = "//table[@id='table1']/tbody/tr/td[2][contains(text(),'"+com+"')]//preceding-sibling::td";
            System.out.println(xpath);
            String value = driver.findElement(By.xpath(xpath)).getText();

            System.out.println(com+ " --> " + value);
        }
    }
}
