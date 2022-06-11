package BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class FirefoxBrowserLaunch {


    WebDriver driver;
    @BeforeTest
    public void setup(){
        String path = System.getProperty("user.dir")+ File.separator+"driver"+File.separator+"geckodriver";
        System.setProperty("webdriver.gecko.driver",path);
        driver = new FirefoxDriver();
    }

    @Test
    public void run(){
        driver.get("https://www.google.com");
    }
}
