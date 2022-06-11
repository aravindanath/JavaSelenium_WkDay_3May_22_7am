package Locators;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByTagName extends BaseClass {

    @Test
    public void byLinkText() throws InterruptedException {

        driver.get("https://www.amazon.in/");

      List<WebElement> links =   driver.findElements(By.tagName("a"));

      System.out.println("Count: "+ links.size());


      for(WebElement element : links){
          System.out.println(element.getText() +" --> "+ element.getAttribute("href"));
      }


    }
}
