package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ExampleGroupExection{


    @Test(groups = {"SmokeTest"})
    public void login(){
      System.out.println("Login smoke");
    }




    @Test(groups = {"SmokeTest"})
    public void search(){
        System.out.println("Search smoke");
    }




    @Test(groups = {"Regression"})
    public void homepage(){
        System.out.println("homepage");
    }




    @Test(groups = {"Regression"})
    public void logout(){
        System.out.println("Logout");
    }


}
