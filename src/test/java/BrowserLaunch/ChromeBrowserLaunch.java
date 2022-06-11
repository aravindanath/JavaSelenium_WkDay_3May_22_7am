package BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class ChromeBrowserLaunch {


    WebDriver driver;
    @BeforeTest
    public void setup(){
        String path = System.getProperty("user.dir")+ File.separator+"driver"+File.separator+"chromedriver";
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
    }

    @Test
    public void run(){
        driver.get("https://www.google.com");
    }
}
