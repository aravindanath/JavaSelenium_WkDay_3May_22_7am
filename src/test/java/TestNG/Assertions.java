package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {


    @Test
    public void hardAssert(){

        System.out.println("Hard Assert start");

        String actual = "Hello";

        Assert.assertEquals(actual,"hello","Assert Not match");

        System.out.println("Hard Assert End");


    }


    @Test
    public void softAssert(){

        System.out.println("Soft Assert start");

        String actual = "Hello";

        SoftAssert sf = new SoftAssert();
        sf.assertEquals(actual,"hello","Assert Not match");

        System.out.println("Soft Assert End");
        sf.assertAll();


    }

}
