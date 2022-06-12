package SeleniumFucntions;


import TestNG.BaseClass;
import day7.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragNDrop extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {

        driver.get("https://demo.guru99.com/test/drag_drop.html");

        WebElement element1 =  driver.findElement(By.xpath("(//li[@id='fourth']/a)[1]"));

        WebElement element2 = driver.findElement(By.xpath("//ol[@id='amt7']"));

         Generic.dragAndDrop(driver,element1,element2);


    }


}
