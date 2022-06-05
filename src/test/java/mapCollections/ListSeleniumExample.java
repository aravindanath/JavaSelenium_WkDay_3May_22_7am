package mapCollections;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSeleniumExample {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");


       List<WebElement> values =  driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
       System.out.println("Total values: "+values.size());


       ArrayList<String> emptyList = new ArrayList<>();


       for(WebElement ele : values){

           emptyList.add(ele.getText());
//           System.out.println(ele.getText());
       }



       System.out.println("Unsorted: "+emptyList);

        Collections.sort(emptyList);

        System.out.println("Sorted: "+emptyList);

        driver.quit();

    }
}
