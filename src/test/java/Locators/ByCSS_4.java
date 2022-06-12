package Locators;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByCSS_4 extends BaseClass {

    @Test
    public void byid(){

        /**
         *   # --> id
         *   . --> class
         *   * --> contains
         *   $ --> endswith
         *   ^ ---> startswith
         *
         */

        driver.get("https://www.amazon.in");
        driver.findElement(By.cssSelector("input[id^='two']")).sendKeys("Mac Books pro", Keys.ENTER);
    }
}
