package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_005 extends BaseClass{

    @Test(dataProvider = "data")
    public void search(String email, String password) throws InterruptedException {
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        Thread.sleep(2000);
        WebElement emailText = driver.findElement(By.id("Email"));
        emailText.clear();
        emailText.sendKeys(email);
        Thread.sleep(2000);
        WebElement passwordText = driver.findElement(By.id("Password"));
        passwordText.clear();
        passwordText.sendKeys(password,Keys.ENTER);
        Thread.sleep(2000);
    }


    @DataProvider
    public Object[][] data(){

        Object[][] obj = new Object[4][2];
        obj[0][0]="arvind@testmail.com";
        obj[0][1]="arvind";
        obj[1][0]="Tejashree@testmail.com";
        obj[1][1]="tej";
        obj[2][0]="suma@testmail.com";
        obj[2][1]="suma";
        obj[3][0]="admin@yourstore.com";
        obj[3][1]="admin";

        return obj;
    }




}
