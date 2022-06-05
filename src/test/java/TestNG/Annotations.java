package TestNG;


import org.testng.annotations.*;

public class Annotations {

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

   @Test(priority = 3)
    public void test(){
        System.out.println("hello world");
    }

    @Test(priority = 2)
    public void test2() {

        System.out.println("Test 2");

    }


    @Test(priority = 1)
    public void test3() {

        System.out.println("Test 3");

    }
}
