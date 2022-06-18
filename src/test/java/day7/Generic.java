package day7;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Properties;

public class Generic {


    public static String getValue(String key){

        String path = System.getProperty("user.dir")+ File.separator+"testdata"+File.separator+"config.properties";
        String x = null;
        try {
            BufferedReader fis = new BufferedReader(new FileReader(path));
            Properties prop = new Properties();
            prop.load(fis);
            x  =  prop.getProperty(key);
        }catch (Exception e){
            e.printStackTrace();
        }
        return x;

    }

    public static void mouseHover(WebDriver driver, WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public static void click(WebDriver driver, WebElement element){
        Actions actions = new Actions(driver);
        actions.click(element).build().perform();
    }

    /**
     * @author Arvind
     * @param driver
     * @param element1
     * @param element2
     */
    public static void dragAndDrop(WebDriver driver, WebElement element1, WebElement element2){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(element1,element2).build().perform();
    }

    public static void rightClick(WebDriver driver, WebElement element){
        Actions actions = new Actions(driver);
        actions.contextClick(element).build().perform();
    }



    public static void listOfElements(List<WebElement> element,String text){

       List<WebElement> elementsList = element;

        System.out.println("Total of values "+ elementsList.size());

        for(WebElement ele : elementsList){
            System.out.println(ele.getText());
            if(ele.getText().equalsIgnoreCase(text)){
                ele.click();
                break;
            }
        }


    }


    public static void takeScreenshot(WebDriver driver){
        try {
            TakesScreenshot srcShot = (TakesScreenshot) driver; // Type case
            File src = srcShot.getScreenshotAs(OutputType.FILE);
            File dest = FileUtils.getFile("./screenshot.png");
            FileUtils.copyFile(src, dest);
        }catch (Exception e){

        }

    }


    public static void scroll(WebDriver driver, WebElement element){

        JavascriptExecutor js  = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element);

    }
}
