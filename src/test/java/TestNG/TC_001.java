package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_001 extends BaseClass{


    @Test
    public void search(){
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium Jobs", Keys.ENTER);
    }


}
