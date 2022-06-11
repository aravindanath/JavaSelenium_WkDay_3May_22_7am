package BrowserLaunch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeLaunch_WM {

    @Test
    public void launch(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
       WebDriver driver =  WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com");
    }
}
