package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_002 {


    @Test(priority = 3)
    public void test1() {

        System.out.println("Test 1");

    }




    @Test
    public void test4() {

        System.out.println("Test 4");

    }


}
