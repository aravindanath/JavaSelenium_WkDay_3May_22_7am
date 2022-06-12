package Locators;

import TestNG.BaseClass;
import day6.Cat;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXpath_7 extends BaseClass {

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





        driver.get("https://www.moneycontrol.com/markets/global-indices/");

        String commodity [] ={"GOLD","SILVER","COTTON"};
        for(String com : commodity) {
            String xpath = "(//table[@class='mctable1'])[3]/tbody/tr/td/p/a[contains(text(),'"+com+"')]//following::td";
            System.out.println(xpath);
            String value = driver.findElement(By.xpath(xpath)).getText();

            System.out.println(com+ " --> " + value);
        }
    }
}
