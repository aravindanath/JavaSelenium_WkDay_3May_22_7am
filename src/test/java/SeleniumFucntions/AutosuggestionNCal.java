package SeleniumFucntions;


import TestNG.BaseClass;
import com.google.gson.Gson;
import day7.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AutosuggestionNCal extends BaseClass {


    @Test
    public void mouseHover() throws InterruptedException {


        driver.get("https://www.redbus.in/");


        driver.findElement(By.id("src")).sendKeys("Bang");


        List<WebElement> src = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));

        Generic.listOfElements(src,"KR Puram, Bangalore");

//        System.out.println("Total No of pickup points "+ src.size());
//
//        for(WebElement element : src){
//            System.out.println(element.getText());
//            if(element.getText().equalsIgnoreCase("KR Puram, Bangalore")){
//                element.click();
//                break;
//            }
//        }



        driver.findElement(By.id("dest")).sendKeys("Hyd");


        List<WebElement> dest = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));

        Generic.listOfElements(dest,"Nizampet, Hyderabad");

//        System.out.println("Total No of drop points "+ dest.size());
//
//        for(WebElement element : dest){
//            System.out.println(element.getText());
//            if(element.getText().equalsIgnoreCase("Nizampet, Hyderabad")){
//                element.click();
//                break;
//            }
//        }



        driver.findElement(By.cssSelector(".fl.icon-calendar_icon-new.icon-onward-calendar.icon")).click();


        List<WebElement> cal =  driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));
        Thread.sleep(3000);

        for(WebElement element : cal){
            if(!element.getText().equals("July 2022")){
                driver.findElement(By.xpath("//button[text()='>']")).click();
                break;
            }
        }

        Thread.sleep(3000);


        List<WebElement> calNext =  driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));


        for(WebElement element : calNext){
            if(element.getText().equals("22")){
               element.click();
               break;
            }
        }

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
        Thread.sleep(3000);
        Generic.takeScreenshot(driver);


    }
}