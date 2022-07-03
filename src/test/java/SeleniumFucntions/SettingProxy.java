package SeleniumFucntions;


import TestNG.BaseClass;
import day7.Generic;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SettingProxy  {


    protected WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
//        ops.addArguments("--headless");
        ops.setAcceptInsecureCerts(true);
//        ops.addArguments("--proxy-server=%s","11.121.111.11:8080");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void mouseHover() throws InterruptedException, AWTException {

        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("Selenium Jobs", Keys.ENTER);
        Thread.sleep(2000);
//        driver.navigate().refresh();
//
//        driver.findElement(By.name("q")).sendKeys("\"appium Jobs\"",Keys.F5);
//        Thread.sleep(2000);
//        System.out.println("Page title "+ driver.getTitle());
//
        Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_F5);
        Thread.sleep(2000);
        rbt.keyRelease(KeyEvent.VK_F5);

    }


}
